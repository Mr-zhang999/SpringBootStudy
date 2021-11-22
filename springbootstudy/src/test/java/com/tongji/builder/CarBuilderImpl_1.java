package com.tongji.builder;/*
 * @author ZhangChunyuan
 * @date 2021-11-19 10:54
 */

public class CarBuilderImpl_1 extends CarBuilder{
    @Override
    public void buildBrand() {
        System.out.println("给小汽车加了HM品牌");

    }

    @Override
    public void buildBattery() {
        System.out.println("给小汽车加了NF电池");
    }
}
