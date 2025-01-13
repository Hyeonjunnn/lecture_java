package com.beyond.api.practice;

public class B_wrapper {
    /*
    * Wrapper 클래스
    * - 기본 자료형을 객체로 포장해 주는 클래스이다.
    * - 기본 자료형을 Wrapper 클래스로 포장해 주는 것을 Boxing이라고 한다.
    * - Wrapper 클래스를 기본 자료형으로 변경해 주는 것을 Unboxing이라고 한다.
    */
    public void method1(){
        // 1. Boxing(기본 타입 -> Wrapper 객체)
        // 1) Wrapper 클래스로 객체를 생성하는 방법
        // Integer integer = new Integer(10);
        // Double double1 = new Double(3.14);
        // Double double2 = new Double(3.14);
        
        // 2) 정적 메소드를 통해서 생성하는 방법
        // Integer integer = Integer.valueOf(10);
        // Double double1 = Double.valueOf(3.14);
        // Double double2 = Double.valueOf(3.14);

        // 3) Auto Boxing(1.5부터 지원)
        Integer integer = 5;
        Double double1 = 1.2345678;
        Double double2 = 1.2345678;

        System.out.println(integer);
        System.out.println(double1);
        System.out.println(double2);
        // System.out.println(double1 == double2);
        System.out.println(double1.equals(double2));
        System.out.println();

        // 2. UnBoxing(Wrapper 객체 -> 기본 타입)
        // 1) Wrapper 객체의 메소드를 이용하는 방법
        // int number = integer.intValue();
        // double dNumber1 = double1.doubleValue();
        // double dNumber2 = double2.doubleValue();

        // 2) Auto Unboxing
        int number = integer;
        double dNumber1 = double1;
        double dNumber2 = double2;

        System.out.println(number);
        System.out.println(dNumber1);
        System.out.println(dNumber2);
        System.out.println(dNumber1 == dNumber2);
        System.out.println();

        System.out.println(number * 2);
        System.out.println(dNumber1 + dNumber2);
        System.out.println();
    }
}
