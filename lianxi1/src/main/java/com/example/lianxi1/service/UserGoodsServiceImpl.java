package com.example.lianxi1.service;

import com.example.lianxi1.dao.TypeMapper;
import com.example.lianxi1.dao.UserGoodsMapper;
import com.example.lianxi1.pojo.Goods;
import com.example.lianxi1.pojo.GoodsType;
import com.example.lianxi1.pojo.User;
import com.example.lianxi1.pojo.Shopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Service
public class UserGoodsServiceImpl implements UserGoodsService {
    @Autowired
    private UserGoodsMapper userGoodsMapper;
    @Autowired
    private TypeMapper typeMapper;

    public List<User> acquire1(){
        return userGoodsMapper.acquire();
    }
    public List<Goods> acquire2(){
        return userGoodsMapper.acquire3();
    }
    public void addgoods(HttpServletRequest rquest, MultipartFile myfile)throws Exception{
        if(!myfile.isEmpty()) {
            String path = ResourceUtils.getURL("classpath:").getPath() + "static";
            String fileName = myfile.getOriginalFilename();
            String giamg = fileName;
            File filePath = new File(path + File.separator + fileName);
            myfile.transferTo(filePath);
            String gname = rquest.getParameter("gname");
            String gorice = rquest.getParameter("gorice");
            String gprice = rquest.getParameter("gprice");
            String gstore = rquest.getParameter("gstore");
            String gmiaoshu = rquest.getParameter("gmiaoshu");
            int rec = Integer.parseInt(rquest.getParameter("rec"));
            int guagao = Integer.parseInt(rquest.getParameter("guagao"));
            String type = rquest.getParameter("type");
            int a;
            List<Goods> goods = userGoodsMapper.acquire3();
            GoodsType goodsType = typeMapper.chazhao(type);
            a = goodsType.getId();
            if (gname.equals("") || gorice.equals("") || gprice.equals("") || gstore.equals("") || giamg.equals("")) {
                System.out.println("传入的参数有空值");
            } else {
                userGoodsMapper.addgoods(gname, gorice, gprice, gstore, giamg, rec, guagao, a,gmiaoshu);

            }
        }
    }
    public List<Goods> detail(int id){
        return userGoodsMapper.detail(id);
    }
    public void updategoods(HttpServletRequest rquest){
        int id = Integer.parseInt(rquest.getParameter("id"));
        String gname = rquest.getParameter("gname");
        String gorice = rquest.getParameter("gorice");
        String gprice = rquest.getParameter("gprice");
        String gstore = rquest.getParameter("gstore");
        String giamg = rquest.getParameter("giamg");
        int rec = Integer.parseInt(rquest.getParameter("rec"));
        int guagao = Integer.parseInt(rquest.getParameter("guagao"));
        String type = rquest.getParameter("type");
        int a;
        GoodsType goodsType=typeMapper.chazhao(type);
        a=goodsType.getId();
        if(gname.equals("") || gorice.equals("") || gprice.equals("") || gstore.equals("") || giamg.equals("")){
            System.out.println("传入的参数有空值");
        }
        else{
            userGoodsMapper.updategoods(id,gname,gorice,gprice,gstore,giamg,rec,guagao,a);
        }
    }
    public void delete(int id){
        userGoodsMapper.delete(id);
    }
    public void join(int goodstable_id,int busertable_id){
        userGoodsMapper.join(goodstable_id,busertable_id);
    }
    public List<Goods> gouwuche(int id){
        return userGoodsMapper.gouwuche(id);
    }
    public int number1(int id){
        System.out.println(userGoodsMapper.number1(id));
        return userGoodsMapper.number1(id);
    }
    public GoodsType serachType(String typename){
        return userGoodsMapper.searchType(typename);
    }
    public List<Goods> serachGoods(int id){
        return userGoodsMapper.searchGoods(id);
    }
    public void shopping(HttpServletRequest request,int goodstable_id,int busertable_id){
        String province=request.getParameter("province");
        String city=request.getParameter("city");
        String county=request.getParameter("county");
        String sname=request.getParameter("sname");
        String sphone=request.getParameter("sphone");
        String sum1=request.getParameter("ssum");
        String detail_address=request.getParameter("detail_address");
        int ssum=Integer.parseInt(sum1);
        System.out.println(1111111);
        if(province.equals("") || city.equals("") || county.equals("") || sname.equals("") || sphone.equals("") || sum1.equals("")){
            System.out.println("传入的参数有空值");
        }
        else{
            userGoodsMapper.shopping(busertable_id,goodstable_id,province,city,county,detail_address,ssum,sname,sphone);
        }
    }

    public List<Shopping> payment1(int id1, int id2){
        return userGoodsMapper.payment1(id1,id2);
    }

    public void payment_update(int id1,int id2){
        userGoodsMapper.payment_update(id1,id2);
    }
}
