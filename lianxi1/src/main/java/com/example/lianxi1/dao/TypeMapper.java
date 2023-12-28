package com.example.lianxi1.dao;

import com.example.lianxi1.pojo.GoodsType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {
    List<GoodsType> search();
    GoodsType chazhao(@Param("type") String type);
    void addgoodstype(@Param("typename") String typename);
    void deletetype(@Param("id") int id);
}
