package com.tongji.builder;/*
 * @author ZhangChunyuan
 * @date 2021-11-19 10:56
 */

public class CarBuilderImpl_2 extends CarBuilder{
    @Override
    public void buildBrand() {
        System.out.println("给小汽车加了ADSZ品牌");

    }

    @Override
    public void buildBattery() {
        System.out.println("给小汽车加了PT电池");
    }
}
