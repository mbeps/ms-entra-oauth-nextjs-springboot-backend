package com.maruf.oauth.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Exposes frontend-specific configuration such as redirect URLs and allowed CORS origins.
 * Keeping these values in configuration makes it easy to point the stack at custom domains.
 */
@Component
@ConfigurationProperties(prefix = "frontend")
@Data
public class FrontendProperties {

    /**
     * Base URL for redirecting back to the frontend after OAuth login.
     */
    private String url = "https://localhost:3000";

    /**
     * Allowed origins for cross-origin AJAX calls.
     */
    private List<String> allowedOrigins = new ArrayList<>(List.of(
        "https://localhost:3000",
        "http://localhost:3000"
    ));
}
