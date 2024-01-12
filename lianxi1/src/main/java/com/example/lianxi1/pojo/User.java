package com.example.lianxi1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
