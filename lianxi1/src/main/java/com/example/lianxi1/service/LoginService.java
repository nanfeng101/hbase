package com.example.lianxi1.service;

import com.example.lianxi1.pojo.User;
import com.example.lianxi1.pojo.UserAdmin;
import org.springframework.web.multipart.MultipartFile;

public interface LoginService {
    void register1(String username, String password, MultipartFile myfile)throws Exception;
    UserAdmin Login1(String username, String password);
    User Login11(String username, String password);
    UserAdmin user_id(String username);
}
