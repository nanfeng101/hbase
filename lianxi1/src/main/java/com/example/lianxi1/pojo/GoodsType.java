package com.example.lianxi1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsType {
    private int id;
    private String typename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
