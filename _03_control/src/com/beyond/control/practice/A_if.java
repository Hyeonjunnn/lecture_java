package com.beyond.control.practice;

import java.util.Scanner;

public class A_if {
    /*
    * if문
    * [표현법]
    * if (조건식) {
    *   .. 실행 코드 ..
    * } [else if (조건식) {
    *   .. 실행 코드 ..
    * }] [else {
    *   .. 실행 코드 ..
    * }] -- 각각 생략 가능
    */

    // 사용자에게 입력받은 정수값이 홀수인지 짝수인지 판별하기
    public void method1(){
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 입력 > ");
        number = scanner.nextInt();

        if((number % 2) == 0){
            System.out.printf("%d 은(는) 짝수입니다.\n", number);
        } else{
            System.out.printf("%d 은(는) 홀수입니다.\n", number);
        }
        
    }

    // 사용자에게 이름을 받아서 "홍길동"이 맞는지 확인하지
    public void method2(){
        String name = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요. > ");
        name = scanner.nextLine();

        // System.out.println("홍길동" == "홍길동"); // true
        // System.out.println("홍길동" == new String("홍길동")); // false
        // System.out.println(name == "홍길동"); // false

        // System.out.println("홍길동".equals("홍길동")); // true
        // System.out.println("홍길동".equals(new String("홍길동"))); // true
        // System.out.println("홍길동".equals(name)); // true

        // if(name.equals("홍길동")){
        if("홍길동".equals(name)){
            System.out.printf("%s은(는) 홍길동 본인입니다.\n", name);
        } else {
            System.out.printf("%s은(는) 홍길동 본인이 아닙니다.\n", name);
        }
    }

    // 사용자로부터 알파벳 하나를 입력받아 대문자인지 소문자인지 확인하기
    public void method3(){
        char alphabet = '\u0000';
        Scanner scanner = new Scanner(System.in);

        System.out.print("할파벳 하나를 입력하세요 > ");
        alphabet = scanner.next().charAt(0);
        
        // if((65 <= alphabet) && (alphabet <= 94)){
        if(('A' <= alphabet) && (alphabet <= 'Z')){
            System.out.printf("%c은(는) 대문자입니다\n", alphabet);
        } else if(('a' <= alphabet) && (alphabet <= 'z')){
            System.out.printf("%c은(는) 소문자입니다\n", alphabet);
        } else {
            System.out.printf("%c은(는) 알파벳이 아닙니다\n", alphabet);
        }

    }

    /*
    * 실습 문제
    * 사용자에게 점수(0 ~ 100)를 입력받아서 점수별로 등급을 출력하라
    *   - 90점 이상은 A 등급
    *   - 90점 미만 80점 이상은 B 등급
    *   - 80점 미만 70점 이상은 C 등급
    *   - 70점 미만 60점 이상은 D 등급
    *   - 60점 미만 F 등급
    *
    *   예시)
    *       점수 > 90
    *       당신의 점수는 90점 이고 등급은 A입니다.
    *   - */
    public void practice(){
        int score = 0;
        char grade = '\u0000';
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 > ");
        score = scanner.nextInt();

        if(score >= 90){
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70){
            grade = 'C';
        } else if (score >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.printf("당신의 점수는 %d점 이고, 등급은 %c등급 입니다.\n", score, grade);
    }

}
