package com.tongji.builder;/*
 * @author ZhangChunyuan
 * @date 2021-11-19 10:53
 */

public abstract class CarBuilder {
    Car car = new Car();

    /**
     * 构建品牌
     */
    public abstract void buildBrand();

    /**
     * 构建电池
     */
    public abstract void buildBattery();

    /**
     * 假设这辆车 有品牌 有驱动力就可以出厂了
     */
    public Car buildCar() {
        return car;
    }
}
