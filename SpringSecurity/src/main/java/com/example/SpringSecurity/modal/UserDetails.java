package com.example.SpringSecurity.modal;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserDetails {
    private String userName;
    private String password;
    private String email;
}
