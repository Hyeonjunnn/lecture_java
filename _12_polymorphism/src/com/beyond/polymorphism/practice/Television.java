package com.beyond.polymorphism.practice;

public class Television extends Product{

    private int inch;               // 인치

    public Television(){

    }

    public Television(String code, String name, String brand, int price, int inch) {
        super(code, name, brand, price);

        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Television{" +
                "inch=" + inch +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}