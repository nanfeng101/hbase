package com.example.lianxi1.service;

import com.example.lianxi1.dao.UserAdminMapper;
import com.example.lianxi1.pojo.UserAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserAdminServiceImpl implements UserAdminService{
    @Autowired
    private UserAdminMapper userAdminMapper;
    public List<UserAdmin> xianshi(){
        return userAdminMapper.xianshi();
    }
}
