package dev.berke.token_api.dto;

import java.util.List;

public record JwtResponse(
        String token,
        String type,
        Long id,
        String username,
        String email,
        List<String> roles
) {

    // custom constructor to set default value of "String type" = "Bearer"
    public JwtResponse(String token, Long id, String username, String email, List<String> roles) {
        this(token, "Bearer", id, username, email, roles);
    }
}
