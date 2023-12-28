package com.example.lianxi1.controller;

import com.example.lianxi1.pojo.User;
import com.example.lianxi1.pojo.UserAdmin;
import com.example.lianxi1.service.LoginService;
import com.example.lianxi1.service.ShoppingService;
import com.example.lianxi1.service.UserGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.soap.SAAJResult;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserGoodsService userGoodsService;
    @Autowired
    private ShoppingService shoppingService;
    @RequestMapping("/head")
    public String a(Model model){
        model.addAttribute("goods2",userGoodsService.acquire2());
        return "head";
    }
    //实现管理员的登录功能
    @RequestMapping("adminLogin")
    public String adminLogin(HttpServletRequest request,Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = loginService.Login11(username, password);
        if (user != null) {
            model.addAttribute("goods2",userGoodsService.acquire2());
            return "redirect:/home";
        }
        else{
            return "adminLogin";
        }
    }
    @RequestMapping("/")
    public String q(){
        return "login";
    }
    //实现用户登录功能
    @RequestMapping("/login")
    public String Login(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserAdmin user = loginService.Login1(username, password);
        model.addAttribute("goods2",userGoodsService.acquire2());
        model.addAttribute("useradmin",loginService.user_id(username));
        if (user != null) {
            model.addAttribute("add",username);
//            model.addAttribute("goods1",userGoodsService.acquire1());
            return "headLogin";
        }
        else{
            return "login";
        }
    }
    @RequestMapping("aaa")
    public String aaa(){
        return "head";
    }
    //用户注册功能
    @RequestMapping("/register")
    public String register(HttpServletRequest request, @RequestParam("bpicture") MultipartFile myfile )throws  Exception{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username!=null && password!=null) {
            loginService.register1(username, password,myfile);
            return "login";
        }
        else{
            return "login";
        }
    }
}
