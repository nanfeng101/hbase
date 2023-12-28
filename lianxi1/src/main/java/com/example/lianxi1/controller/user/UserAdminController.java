package com.example.lianxi1.controller.user;

import com.example.lianxi1.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAdminController {
    @Autowired
    private UserAdminService userAdminService;
    @RequestMapping("useradmin")
    public String useradmin(Model model){
        model.addAttribute("useradmin1",userAdminService.xianshi());
        return "useradmin";
    }
}
