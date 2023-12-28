package com.example.lianxi1.dao;

import com.example.lianxi1.pojo.User;
import com.example.lianxi1.pojo.UserAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    void register(@Param("username") String username, @Param("password") String password,@Param("fileName") String fileName);

    UserAdmin Login(@Param("username") String username, @Param("password") String password);
    User Login11(@Param("username") String username, @Param("password") String password);
    UserAdmin user_id(@Param("username") String username);
}
