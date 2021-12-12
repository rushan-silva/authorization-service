package com.token.api.dto.token;

import javax.validation.constraints.NotNull;

public class TokenDTO {

    @NotNull(message = "Token can not be null")
    private String username;

    @NotNull(message = "System username can not be null")
    private String password;

    @NotNull(message = "Requested System can not be null")
    private String requestedSystem;

    public TokenDTO(@NotNull(message = "Token can not be null") String username, @NotNull(message = "System username can not be null") String password, @NotNull(message = "Requested System can not be null") String requestedSystem) {
        this.username = username;
        this.password = password;
        this.requestedSystem = requestedSystem;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRequestedSystem() {
        return requestedSystem;
    }

    public void setRequestedSystem(String requestedSystem) {
        this.requestedSystem = requestedSystem;
    }
}
