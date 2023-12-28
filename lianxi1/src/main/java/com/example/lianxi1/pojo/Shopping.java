package com.example.lianxi1.pojo;

public class Shopping {
    private int id;
    private String gname;
    private double grprice;
    private String gpicture;
    private int busertable_id;

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getGrprice() {
        return grprice;
    }

    public void setGrprice(double grprice) {
        this.grprice = grprice;
    }

    public String getGpicture() {
        return gpicture;
    }

    public void setGpicture(String gpicture) {
        this.gpicture = gpicture;
    }

    private  int goodstable_id;
    private  int ssum;
    private String province;
    private String city;
    private String county;
    private String detail_address;
    private String sname;
    private String sphone;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBusertable_id() {
        return busertable_id;
    }

    public void setBusertable_id(int busertable_id) {
        this.busertable_id = busertable_id;
    }

    public int getGoodstable_id() {
        return goodstable_id;
    }

    public void setGoodstable_id(int goodstable_id) {
        this.goodstable_id = goodstable_id;
    }

    public int getSsum() {
        return ssum;
    }

    public void setSsum(int ssum) {
        this.ssum = ssum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDetail_address() {
        return detail_address;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
