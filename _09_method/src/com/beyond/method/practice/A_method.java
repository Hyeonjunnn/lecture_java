package com.beyond.method.practice;

import java.util.ArrayList;
import java.util.List;

public class A_method {
    // 1. 매개변수와 반환값이 없는 메소드
    public void method1(){
        System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");

        // return 문 뒤에 반환값이 오면 에러가 발생한다.
        // return "hello"; // 에러
        // return; // 반환값 없이 사용은 가능하다.

        // System.out.println("리턴 이후 실행"); // 리턴 이후 실행 불가능
    }
    
    // 2. 매개변수가 없고 반환값은 있는 메소드
    public String method2(){
        String str = null;

        str = "매개변수가 없지만 반환값은 있는 메소드입니다.";

        // return "";
        // return null;
        return str;
    }
    
    // 3. 매개변수가 있고 반환값은 없는 메소드
    public void method3(int number1, int number2){
        System.out.printf("입력받은 매개변수의 합 : %d\n", number1 + number2);
    }

    // 4. 매개변수가 있고 반환값도 있는 메소드
    public int method4(int number1, int number2){

        return number1 * number2;
    }

    // 5. 매개변수로 User 객체를 전달받는 메소드
    public void method5(User user){
        user.setId("kim123");
        user.setPassword("123456789");
        user.setName("김철수");
    }

    // 6. 매개변수로 가변인자를 전달받는 메소드
    //  1) 배열을 사용하는 방법
    // public int method6(int[] numbers){
    //  2) 가변 인자를 사용하는 방법
    public int method6(int... numbers){
        int sum = 0;

        System.out.println(numbers.length);

        for (int number : numbers){
            sum += number;
        }

        return sum;
    }

}
