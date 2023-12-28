package com.example.lianxi1.pojo;

import org.springframework.web.multipart.MultipartFile;

public class Goods {
    private int id;
    private String gname;
    private double goprice;
    private double grprice;
    private int gstore;
    private String gpicture;
    private int isRecommend;
    private int isAdvertisement;
    private int goodstype_id;
    private String gmiaoshu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getGoprice() {
        return goprice;
    }

    public void setGoprice(double goprice) {
        this.goprice = goprice;
    }

    public double getGrprice() {
        return grprice;
    }

    public void setGrprice(double grprice) {
        this.grprice = grprice;
    }

    public int getGstore() {
        return gstore;
    }

    public void setGstore(int gstore) {
        this.gstore = gstore;
    }

    public String getGpicture() {
        return gpicture;
    }

    public void setGpicture(String gpicture) {
        this.gpicture = gpicture;
    }

    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    public int getIsAdvertisement() {
        return isAdvertisement;
    }

    public void setIsAdvertisement(int isAdvertisement) {
        this.isAdvertisement = isAdvertisement;
    }

    public int getGoodstype_id() {
        return goodstype_id;
    }

    public String getGmiaoshu() {
        return gmiaoshu;
    }

    public void setGmiaoshu(String gmiaoshu) {
        this.gmiaoshu = gmiaoshu;
    }

    public void setGoodstype_id(int goodstype_id) {
        this.goodstype_id = goodstype_id;
    }

}
