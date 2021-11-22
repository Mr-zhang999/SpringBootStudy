package com.tongji.builder;/*
 * @author ZhangChunyuan
 * @date 2021-11-19 10:56
 */

public class BuilderTest {
    public static void main(String[] args) {
        //实际建造者 new
        CarBuilder carBuilder = new CarBuilderImpl_2();
        //建造指挥者 new
        CarDirector carDirector = new CarDirector(carBuilder);
        Car car = carDirector.carConductor();

    }
}
