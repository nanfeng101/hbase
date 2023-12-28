package com.example.lianxi1.service;

import com.example.lianxi1.pojo.Goods;
import com.example.lianxi1.pojo.GoodsType;
import com.example.lianxi1.pojo.User;
import com.example.lianxi1.pojo.Shopping;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserGoodsService {
    List<User> acquire1();
    List<Goods> acquire2();
    void addgoods(HttpServletRequest rquest, MultipartFile myile)throws Exception;
    void updategoods(HttpServletRequest rquest);
    void delete(int id);
    List<Goods> detail(int id);
    void join(int goodstable_id,int busertable_id);
    List<Goods> gouwuche(int id);
    int number1(int id);
    GoodsType serachType(String typename);
    List<Goods> serachGoods(int id);
    void shopping(HttpServletRequest request,int goodstable_id,int busertable_id);
    List<Shopping> payment1(int id1, int id2);
    void payment_update(int id1,int id2);
}
