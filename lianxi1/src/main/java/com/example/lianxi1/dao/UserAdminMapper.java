package com.example.lianxi1.dao;

import com.example.lianxi1.pojo.UserAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserAdminMapper {
    List<UserAdmin> xianshi();
}
