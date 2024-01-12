package com.example.lianxi1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shopping {
    private int id;
    private String gname;
    private double grprice;
    private String gpicture;
    private int busertable_id;
    private  int goodstable_id;
    private  int ssum;
    private String province;
    private String city;
    private String county;
    private String detail_address;
    private String sname;
    private String sphone;
    private int status;
}
