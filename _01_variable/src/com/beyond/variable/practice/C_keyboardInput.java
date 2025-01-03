package com.beyond.variable.practice;

import java.util.Scanner;

public class C_keyboardInput {

    public void inputByScanner(){
        /*
        * Scanner 클래스
        * - 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다.
        */
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        double height = 0;
        String name = null;
        char gender = '\u0000';

        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        System.out.print("Please enter your height: ");
        height = scanner.nextDouble();

        System.out.print("Please enter your gender(M/F): ");
        gender = scanner.next().charAt(0);

        System.out.printf("당신의 이름은 %s이고, 나이는 %d세, 키 %.1fcm, 성별은 %c 입니다.\n", name, age, height, gender);

    }

}
