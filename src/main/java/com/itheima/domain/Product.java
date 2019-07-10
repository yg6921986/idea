package com.itheima.domain;

import lombok.Data;

/**
 * @author Francis.G.Yang
 * @version v1.0
 * @date 2019/7/9 19:03
 * @description TODO
 **/

@Data
public class Product {
    private int id;
    private String name;
    private double price;
    private  String image;
    private String desc;
    private  int cid;
}
