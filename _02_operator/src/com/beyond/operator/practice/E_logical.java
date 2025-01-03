package com.beyond.operator.practice;

import java.util.Scanner;

public class E_logical {

    public void method1(){
        // 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인하기
        int number = 0;
        boolean result = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("임의의 정수를 입력해 주세요. > ");
        number = sc.nextInt();

        // 1 <= number <= 100
        result = ((1 <= number) && (number <= 100));

        System.out.printf("%d는(은) 1부터 100 사이의 값 인가요? %b\n", number, result);
    }

    public void method2(){
        // Short Cut(Short-Circuit Evaluation) 연산 테스트
        int number = 10;
        boolean result = false;

        System.out.println("&& 연산 전의 number 값 : " + number);

        // && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
        result = ((number < 5) && (++number > 0));
        // result = ((number < 5) & (++number > 0));

        System.out.println("result : " + result);
        System.out.println("&& 연산 후의 number 값 : " + number);
        System.out.println();

        System.out.println("|| 연산 전의 number 값 : " + number);

        // || 연산자를 기준으로 앞에서 이미 true가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
        result = ((number < 20) || (++number > 0));
        // result = ((number < 20) | (++number > 0));

        System.out.println("result : " + result);
        System.out.println("|| 연산 후의 number 값 : " + number);
        System.out.println();
    }

}
