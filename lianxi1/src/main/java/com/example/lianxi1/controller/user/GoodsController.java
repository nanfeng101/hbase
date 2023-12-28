package com.example.lianxi1.controller.user;

import com.example.lianxi1.pojo.GoodsType;
import com.example.lianxi1.pojo.User;
import com.example.lianxi1.service.UserGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private UserGoodsService userGoodsService;

    @RequestMapping("/goods")
    @ResponseBody
    public List<User> goods(Model model) {
        model.addAttribute("goods2", "aaaaa");
        List<User> list = userGoodsService.acquire1();
        System.out.println(userGoodsService.acquire1());
        return list;
    }

    //用于商品管理页面的添加功能
    @RequestMapping("/home1")
    public String addgoods(HttpServletRequest rquest, Model model, @RequestParam("giamg") MultipartFile myfile) throws Exception {
        userGoodsService.addgoods(rquest, myfile);
        model.addAttribute("goods2", userGoodsService.acquire2());
        return "redirect:/home";
    }

    //    @RequestMapping("/updategoods")
//    public String updategoods(HttpServletRequest rquest,Model model){
//        userGoodsService.addgoods(rquest);
//        model.addAttribute("goods2",userGoodsService.acquire2());
//        return "updategoods";
//    }
    //用于跳转到商品管理的详情页面
    @RequestMapping("/detail")
    public String detail(int id, Model model) {
        model.addAttribute("goods4", userGoodsService.detail(id));
        return "detail";
    }

    //用于跳转到商品管理的修改页面
    @RequestMapping("/updategoods")
    public String update(int id, Model model) {
        model.addAttribute("goods3", userGoodsService.detail(id));
        return "updategoods";
    }

    //商品管理页面修改功能
    @RequestMapping("/xiugai2")
    public String update1(HttpServletRequest rquest, Model model) {
        int id = Integer.parseInt(rquest.getParameter("id"));
        userGoodsService.updategoods(rquest);
        model.addAttribute("goods3", userGoodsService.detail(id));
//        model.addAttribute("goods3",userGoodsService.updategoods(rquest));
        return "home";
    }

    //商品管理页面删除功能
    @RequestMapping("/delete")
    public String delete(int id, Model model) {
        userGoodsService.delete(id);
        model.addAttribute("goods2", userGoodsService.acquire2());
        return "home";
    }

    //用于从其他页面跳转到商品管理页面
    @RequestMapping("/home")
    public String achive(Model model) {
        model.addAttribute("goods2", userGoodsService.acquire2());
        return "home";
    }

    //点击商品跳转到商品的详情页面
    @RequestMapping("/goodsdetail")
    public String goodsdetail(Model model, int id, int busertable_id) {
        model.addAttribute("goodsdetail", userGoodsService.detail(id));
        model.addAttribute("busertable_id", busertable_id);
        return "goodsdetail";
    }

    //点击将物品加入到购物车
    @RequestMapping("/join")
    public String join(Model model, int goodstable_id, int busertable_id) {
        model.addAttribute("goodsdetail", userGoodsService.detail(goodstable_id));
        userGoodsService.join(goodstable_id, busertable_id);
        return "goodsdetail";
    }

    //点击前往购物车页面
    @RequestMapping("/gouwuche")
    public String gouwuche(Model model, int id) {
        model.addAttribute("gouwuche", userGoodsService.gouwuche(id));
        model.addAttribute("gouwuche1", userGoodsService.number1(id));
        return "gouwuche";
    }

    //跳转到女装界面
    @RequestMapping("/nuzhuang")
    public String nuzhuang(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "nuzhuang";
    }
    //跳转到男装界面
    @RequestMapping("/man")
    public String man(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "man";
    }
    //跳转到美妆界面
    @RequestMapping("/cosmetics")
    public String cosmetics(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "cosmetics";
    }
    //跳转到电器界面
    @RequestMapping("/electric")
    public String electric(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "electric";
    }
    @RequestMapping("/food")
    public String food(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "food";
    }
    //跳转到医药界面
    @RequestMapping("/medicine")
    public String medicine(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "medicine";
    }
    //跳转到玩具界面
    @RequestMapping("/wanju")
    public String wanju(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "wanju";
    }

    //跳转到手机界面
    @RequestMapping("/shouji")
    public String sjouj(Model model, String typename, int id) {
        model.addAttribute("useradmin", id);
        GoodsType goodstype = userGoodsService.serachType(typename);
        int id1 = goodstype.getId();
        model.addAttribute("searchgoods", userGoodsService.serachGoods(id1));
        return "shouji";
    }

    //跳转到购买界面
    @RequestMapping("/shopping1")
    public String shopping1(Model model, int goodstable_id, int busertable_id) {
        model.addAttribute("goodsdetail", userGoodsService.detail(goodstable_id));
        model.addAttribute("goodstable_id", goodstable_id);
        model.addAttribute("busertable_id", busertable_id);
        return "shopping";
    }

    //跳转到支付界面
    @RequestMapping("/shopping")
    public String shopping(HttpServletRequest request, Model model, int goodstable_id, int busertable_id) {
        String sum1 = request.getParameter("ssum");
        int sum11 = Integer.parseInt(sum1);
        model.addAttribute("ssum", sum11);
        model.addAttribute("goodstable_id", goodstable_id);
        model.addAttribute("goodsdetail", userGoodsService.detail(goodstable_id));
        model.addAttribute("busertable_id", busertable_id);
        userGoodsService.shopping(request, busertable_id, goodstable_id);
        return "payment";
    }

    //跳转到支付成功界面
    //1是未支付 2是未发货 3是运输中 4是已接收
    @RequestMapping("/payment")
    public String payment(Model model, double aggregate, int busertable_id, int goodstable_id) {
        model.addAttribute("shopping", userGoodsService.payment1(busertable_id, goodstable_id));
        System.out.println(userGoodsService.payment1(busertable_id, goodstable_id));
        model.addAttribute("busertable_id", busertable_id);
        model.addAttribute("goodstable_id", goodstable_id);
        model.addAttribute("aggeregate", aggregate);
        userGoodsService.payment_update(busertable_id, goodstable_id);
        return "payment_success";
    }
}
