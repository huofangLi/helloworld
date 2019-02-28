package com.soft1721.spring.hello;

/**
 * Created by SHIGAUNG on 2019/2/25.
 */
public class Phone {
    private String brand;
    private double price;

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
