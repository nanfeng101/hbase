package com.example.lianxi1.dao;

import com.example.lianxi1.pojo.Goods;
import com.example.lianxi1.pojo.GoodsType;
import com.example.lianxi1.pojo.User;
import com.example.lianxi1.pojo.Shopping;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserGoodsMapper {
    public List<User> acquire();
    List<Goods> acquire3();
    void addgoods(@Param("gname") String gname,@Param("gorice") String gorice,@Param("gprice") String gprice,@Param("gstore") String gstore,@Param("giamg") String giamg,@Param("rec") int rec,@Param("guagao") int guagao,@Param("a") int a,@Param("gmiaoshu") String gmiaoshu);
    void updategoods(@Param("id") int id,@Param("gname") String gname,@Param("gorice") String gorice,@Param("gprice") String gprice,@Param("gstore") String gstore,@Param("giamg") String giamg,@Param("rec") int rec,@Param("guagao") int guagao,@Param("a") int a);
    List<Goods> detail(@Param("id") int id);
    void delete(@Param("id") int id);
    void join(@Param("goodstable_id") int goodstable_id,@Param("busertable_id") int busertable_id);
    List<Goods> gouwuche(@Param("id") int id);
    int number1(@Param("id") int id);
    GoodsType searchType(@Param("typename") String typename);
    List<Goods> searchGoods(@Param("id") int id);
    void shopping(@Param("goodstable_id") int goodstable_id,@Param("busertable_id") int busertable_id,@Param("province") String province,@Param("city") String city,@Param("county") String county,@Param("detail_address") String detail_address,@Param("ssum") int ssum,@Param("sname") String sname,@Param("sphone") String sphone);

    List<Shopping> payment1(@Param("id1") int id1, @Param("id2") int id2);

    void payment_update(@Param("id1") int id1,@Param("id2") int id2);
}
