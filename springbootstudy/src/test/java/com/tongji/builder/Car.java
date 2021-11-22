package com.tongji.builder;/*
 * @author ZhangChunyuan
 * @date 2021-11-19 10:52
 */

public class Car {
    private String brand;
    /**
     * 电池
     */
    private String battery;

    public Car() {
    }

    public Car(String brand, String battery) {
        this.brand = brand;
        this.battery = battery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
