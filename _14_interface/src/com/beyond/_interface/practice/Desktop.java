package com.beyond._interface.practice;

public class Desktop extends Product{

    private boolean allInOne;   // 일체 여부

    public Desktop(){

    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {
        this.code = code;
        this.name = name;
        super.brand = brand;
        super.price = price;

        this.allInOne = allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    @Override
    public void turnOn() {
        System.out.println("데스크톱을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("데스크톱을 끕니다.");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "allInOne=" + allInOne +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

}
