package com.example.lianxi1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
