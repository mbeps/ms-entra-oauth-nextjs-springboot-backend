package com.maruf.oauth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the subset of OAuth user profile data required by the frontend.
 * Uses camel case field names to align with the frontend models.
 *
 * @author Maruf Bepary
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String id;
    private String login;
    private String name;
    private String email;
    private String avatarUrl;
}
