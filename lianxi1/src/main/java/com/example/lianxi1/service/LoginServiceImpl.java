package com.example.lianxi1.service;

import com.example.lianxi1.dao.LoginMapper;
import com.example.lianxi1.pojo.Goods;
import com.example.lianxi1.pojo.GoodsType;
import com.example.lianxi1.pojo.User;
import com.example.lianxi1.pojo.UserAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public void register1(String username, String password, MultipartFile myfile)throws Exception {
        if(!myfile.isEmpty()) {
            String path = ResourceUtils.getURL("classpath:").getPath() + "static";
            String fileName = myfile.getOriginalFilename();
            File filePath = new File(path + File.separator + fileName);
            myfile.transferTo(filePath);
            if (username.equals("") || password.equals("")) {
                System.out.println("传入的参数有空值");
            } else {
                loginMapper.register(username, password, fileName);
            }
        }
    }
    @Override
    public UserAdmin Login1(String username, String password) {
        UserAdmin user = loginMapper.Login(username, password);
        if (user != null && user.getBemail().equals(username) && user.getBpwd().equals(password)) {
            return user;
        }
        return null;
    }
    @Override
    public User Login11(String username, String password) {
        User user = loginMapper.Login11(username, password);
        if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    public UserAdmin user_id(String username){
        return loginMapper.user_id(username);
    }
}
