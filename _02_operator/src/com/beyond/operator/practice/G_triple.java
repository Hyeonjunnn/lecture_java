package com.beyond.operator.practice;

import java.util.Scanner;

public class G_triple {

    public void method1(){

        // 사용자에게 입력받은 정수가 양수인지 음수인지 판별 후 출력
        int number = 0;
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        number = scanner.nextInt();

        result = (number == 0)? "0 입니다." : ((number > 0) ? "양수입니다." : "음수입니다.");

        System.out.printf("%d는(은) %s\n ", number, result);
    }

}
