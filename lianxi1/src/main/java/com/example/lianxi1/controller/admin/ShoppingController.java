package com.example.lianxi1.controller.admin;

import com.example.lianxi1.pojo.Shopping;
import com.example.lianxi1.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;
    //跳转到订单管理的待支付界面
   @RequestMapping("/no-pay-money")

    public String no_pay_money(int status, Model model){
        model.addAttribute("no_pay_money",shoppingService.no_pay_money(status));
        return "no-pay-money";
    }
    //跳转到订单管理的待收货页面
    @RequestMapping("/wait-consignee")
    public String wait_consignee(int status,Model model){
       model.addAttribute("wait1",shoppingService.no_pay_money(status));
       return "wait-consignee";
    }
    //挑战到订单管理评价界面
}
