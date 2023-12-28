package com.example.lianxi1.service;

import com.example.lianxi1.dao.ShoppingMapper;
import com.example.lianxi1.pojo.Shopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService{
    @Autowired
    private ShoppingMapper shoppingMapper;
    public List<Shopping> no_pay_money(int status){
        return shoppingMapper.no_pay_money(status);
    }
}
