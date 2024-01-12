package com.example.lianxi1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAdmin {
    private int id;
    private String bemail;
    private String bpwd;
    private String bpicture;
}
