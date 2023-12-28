package com.example.lianxi1.dao;

import com.example.lianxi1.pojo.Shopping;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingMapper {
    List<Shopping> no_pay_money(@Param("status") int status);
}
