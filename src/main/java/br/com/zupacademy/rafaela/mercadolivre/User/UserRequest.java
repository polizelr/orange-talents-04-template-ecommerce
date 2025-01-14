package br.com.zupacademy.rafaela.mercadolivre.User;

import br.com.zupacademy.rafaela.mercadolivre.config.validation.UniqueValue;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRequest {
    @NotBlank
    @Email
    @UniqueValue(domainClass = User.class, fieldName = "username")
    private String username;

    @NotBlank
    @Size(min = 6)
    private String password;

    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User convert(){
        return new User(username, password);
    }
}
