package com.example.lianxi1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class carttable {
    private int id;
    private int busertable_id;
    private int goodstable_id;
    private int shoppingnum;
}
