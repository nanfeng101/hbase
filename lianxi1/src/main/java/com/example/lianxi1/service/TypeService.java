package com.example.lianxi1.service;

import com.example.lianxi1.pojo.GoodsType;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface TypeService {
    List<GoodsType> search();
    void addgoodstype(HttpServletRequest request);
    void deletetype(int id);
}
