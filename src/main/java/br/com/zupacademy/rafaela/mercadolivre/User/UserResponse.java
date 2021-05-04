package br.com.zupacademy.rafaela.mercadolivre.User;

import java.time.LocalDateTime;

public class UserResponse {
    private Long id;

    private String username;

    private LocalDateTime createdAt;

    public UserResponse(User user){
        id = user.getId();
        username = user.getUsername();
        createdAt = user.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
