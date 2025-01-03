package com.beyond.operator.practice;

public class F_assignment {

    public void method1(){
        int number = 12;
        String str = "Hello";

        number += 3; // number = number + 3;
        System.out.println("(number += 3) : " + number);

        number -= 5; // number = number - 5;
        System.out.println("(number -= 5) : " + number);

        number *= 6; // number = number * 6;
        System.out.println("(number *= 6) : " + number);

        number /= 3; // number = number / 3;
        System.out.println("(number /= 3) : " + number);

        number %= 3; // number = number % 3;
        System.out.println("(number %= 3) : " + number);

        str += "World!"; // str = str + "World!";
        System.out.println("str : " + str);
    }

}
