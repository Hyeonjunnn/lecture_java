package com.beoynd.inherit.practice;

public class Television extends Product{

    private int inch;               // 인치

    public Television(){}

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

    public String information(){
        // return String.format("code : %s, name : %s, brand : %s, price : %d, inch : %d\n"
        //         , code, name, brand, price, inch);

        return String.format("%s, inch : %d\n", super.information(), inch);
    }

}
