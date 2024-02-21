package com.raja.fatherson;

public class Phone {

    private String model;
    private String brand;

    private String color;


    public Phone(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
