package com.example.lianxi1.controller.admin;

import com.example.lianxi1.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TypeController {
    @Autowired
    private TypeService typeService;
//    前往商品类型管理页面
    @RequestMapping("/goodstype")
    public String goodstype(Model model){
        model.addAttribute("goodstype1",typeService.search());
        return "goodstype";
    }
    //商品类型添加功能
    @RequestMapping("/addgoodstype")
    public String addGoodstype(HttpServletRequest request,Model model){
        typeService.addgoodstype(request);
        model.addAttribute("goodstype1",typeService.search());
        return "redirect:/goodstype";
    }
    //商品类型的删除功能
    @RequestMapping("/deletetype")
    public String deletetype(int id,Model model){
        typeService.deletetype(id);
        model.addAttribute("goodstype1",typeService.search());
        return "goodstype";
    }
}
