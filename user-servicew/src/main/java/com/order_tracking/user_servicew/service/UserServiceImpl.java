package com.order_tracking.user_servicew.service;

import com.order_tracking.user_servicew.dto.UserDto;
import com.order_tracking.user_servicew.dto.UserProfileDto;
import com.order_tracking.user_servicew.entities.User;
import com.order_tracking.user_servicew.entities.UserProfile;
import com.order_tracking.user_servicew.mapper.UserMapper;
import com.order_tracking.user_servicew.repository.UserProfileRepository;
import com.order_tracking.user_servicew.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserProfileRepository profileRepository;
    private final UserMapper mapper;

    @Override
    public UserDto createUser(UserDto dto) {
        User user = User.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .build();

        if (dto.getProfile() != null) {

            log.info("{}", dto.getProfile());

            UserProfileDto profileDto = dto.getProfile();
            UserProfile profile = UserProfile.builder()
                    .firstName(profileDto.getFirstName())
                    .lastName(profileDto.getLastName())
                    .email(profileDto.getEmail())
                    .phoneNumber(profileDto.getPhoneNumber())
                    .age(profileDto.getAge())
                    .address(profileDto.getAddress())
                    .city(profileDto.getCity())
                    .state(profileDto.getState())
                    .country(profileDto.getCountry())
                    .zipCode(profileDto.getZipCode())
                    .build();

            log.info("{}", profile);
            user.setUserProfile(profile);
        }

        return mapper.mapToDto(userRepository.save(user));
    }

    @Override
    public UserDto getUserById(String id) {
        return userRepository.findById(id)
                .map(mapper::mapToDto)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(String id, UserDto dto) {
        User user = userRepository.findById(id).orElseThrow();

        user.setUsername(dto.getUsername());

        if (dto.getProfile() != null && user.getUserProfile() != null) {
            UserProfile profile = user.getUserProfile();
            profile.setAddress(dto.getProfile().getAddress());
            profile.setCity(dto.getProfile().getCity());
            profile.setState(dto.getProfile().getState());
            profile.setCountry(dto.getProfile().getCountry());
            profile.setZipCode(dto.getProfile().getZipCode());
        }

        return mapper.mapToDto(userRepository.save(user));
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

}
