package com.example.lianxi1.service;

import com.example.lianxi1.dao.TypeMapper;
import com.example.lianxi1.pojo.GoodsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService{
    @Autowired
    private TypeMapper typeMapper;
    public List<GoodsType> search(){
        return typeMapper.search();
    }
    public void addgoodstype(HttpServletRequest request){
        String typename=request.getParameter("typename");
        if(typename.equals("")){
            System.out.println("传入的参数为空！");
        }
        else{
            typeMapper.addgoodstype(typename);
        }
    }
    public void deletetype(int id){
        typeMapper.deletetype(id);
    }
}
