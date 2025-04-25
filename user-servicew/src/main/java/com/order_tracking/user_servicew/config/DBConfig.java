package com.order_tracking.user_servicew.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {
    // Load the ..env file from the root directory (User-service)
    private static final Dotenv dotenv = Dotenv.configure()
            .directory("user-servicew/")  // Adjust if needed based on where your ..env is
            .filename(".env")  // Ensure the file is named ..env
            .load();

    public static String getDbUrl() {
        return dotenv.get("DB_URL");
    }

    public static String getUsername() {
        return dotenv.get("DB_USERNAME");
    }

    public static String getPassword() {
        return dotenv.get("DB_PASSWORD");
    }
}
