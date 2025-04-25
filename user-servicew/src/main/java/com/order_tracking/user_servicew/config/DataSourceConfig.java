package com.order_tracking.user_servicew.config;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(DBConfig.getDbUrl())
                .username(DBConfig.getUsername())
                .password(DBConfig.getPassword())
                .build();
    }
}
