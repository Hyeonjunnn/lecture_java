package com.beyond.variable.practice;

public class A_variable {
    /*
        변수의 선언
        [표현법]
        자료형 변수명;

        변수의 초기화
        [표현법]
        변수명 = 값;
    */
    public void variableTest(){
        // 논리형
        boolean isTrue;

        // 정수형
        byte bNum;
        short sNum;
        int iNum;
        long lNum;

        // 실수형
        float fNum;
        double dNum;

        // 문자형
        char ch = 'A';
        // char ch = 97;
        // char ch = -90; // 0 ~ 65535(유니코드)
        // char ch = 30062;
        // char ch = '\u0000';
        // char ch = 0;

        System.out.println("ch : " + ch);
        System.out.println();

        // 문자열
        // String name; // 문자열을 가리킬 수 있는 참조 변수 선언
        // String name = ""; // 빈 문자열로 초기화
        String name = "홍길동";
        // String name = new String("홍길동");
        // String name = null;

        System.out.println("name : " + name.charAt(1));
        System.out.println();

        // 지역 변수를 선언 후 초기화가 되지 않은 경우 에러가 발생한다.
        // System.out.println(isTrue);

        isTrue = true;
        // isTrue = 1; // 에러 발생

        System.out.println("isTrue : " + isTrue);
        System.out.println();

        bNum = 127;
        // bNum = 128; // 에러 발생
        sNum = 32767;
        // sNum = 32768; // 에러 발생
        iNum = 2147483647;
        // iNum = 2147483648; // 에러 발생
        // long 타입의 리터럴은 숫자 뒤에 'L' 또는 'l'을 입력해야 한다.(가능하다면 숫자와의 혼동 방지위해 대문자 'L' 사용)
        lNum = 9223372036854775807L;
        // lNum = 9223372036854775808L; // 에러 발생

        System.out.println("bNum : " + bNum);
        System.out.println("sNum : " + sNum);
        System.out.println("iNum : " + iNum);
        System.out.println("lNum : " + lNum);
        System.out.println();

        // float 타입의 리터럴은 숫자 뒤에 'F' 또는 'f'를 입력해야 한다.
        fNum = 3.141592f;
        dNum = 3.141592;

        System.out.println("fNum : " + fNum);
        System.out.println("dNum : " + dNum);
        System.out.println();

        // final 변수
        // [표현법]
        // final 자료형 변수명;
        // - 특정 변수의 값이 변경되는 걸 원하지 않을때 사용한다.
        // - 초기화 이후에는 값을 변경할 수 없다.

        int age = 20;
        final int AGE = 30;

        System.out.println("age : " + age);
        System.out.println("AGE : " + AGE);

        age = 30;
        // AGE = 40; // 에러 발생

        System.out.println("age : " + age);

        // 변수의 명명 규칙
        // 1) 대소문자 구분
        int number;
        // String number;
        int NUMBER;
        int numBer;

        // 2) 숫자로 시작하면 안 된다.
        // int 1page; // 에러 발생
        int q1w2e3r4;

        // 3) 특수 문자 '_', '$'
        int _age;
        int a_g_e_;
        int $age;
        int a$g$e;
        // int %age; // 에러 발생
        // int age@; // 에러 발생

        // 4) 예약어
        // int void; // 에러 발생
        // int double; // 에러 발생
        // int class; // 에러 발생
        // int public; // 에러 발생
    }

    /*
        자동 형 변환
        - 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다.
    */
    public void autoCasting(){
        byte bNum = 10;
        short sNum = 12;
        int iNum = sNum; // short -> int 자동 형 변환된다.
        // sNum = iNum; // 에러 발생
        long lNum = iNum; // int -> long 자동 형 변환된다.
        // float 타입이 long 타입보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환된다.
        float fNum = lNum;
        double dNum = fNum;

        System.out.println("bNum : " + bNum);
        System.out.println("sNum : " + sNum);
        System.out.println("iNum : " + iNum);
        System.out.println("lNum : " + lNum);
        System.out.println("fNum : " + fNum);
        System.out.println("dNum : " + dNum);
        System.out.println();

        // char 도 코드 값을 지니고
        // int 타입이 char 타입도다 범위가 더 크기 때문에
        // char -> int 자동 형 변환된다.
        char ch = 'A';
        iNum = ch;

        // char 은 음수가 저장될 수 없기 때문에 byte 를 char 로 자동 형 변환 시킬 수 없다.
        // ch = bNum; // 에러 발생

        System.out.println("ch : " + ch);
        System.out.println("iNum : " + iNum);
        System.out.println();

        // int  result = 12 + 3.3; // 에러 발생
        double result1 = 12 + 3.3;
        
        // short, byte 타입의 데이터 연산 시 무조건 int 타입으로 변환 후 처리한다.
        // short result2 = sNum + sNum; // 에러 발생
        // short result2 = sNum + bNum; // 에러 발생
        // byte result2 = bNum + bNum; // 에러 발생

        // 변수의 경우, 런타임 시전에 연산
        int result2_1 = bNum + sNum;
        // 리터럴의 경우, 컴파일 시점에 연산
        byte result2_2 = 10 + 20;

        long result3 = 30 + 30; // 30 + 30 = 60, 60을 long 타입으로 형 변환 후 대입(60L)
        long result4 = 30 + 30L; // 30L + 30L = 60L

        System.out.println("result1 : " + result1);
        System.out.println("result2_1 : " + result2_1);
        System.out.println("result2_2 : " + result2_2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
        System.out.println();

    }

    /*
        강제 형 변환
        - 데이터 표현 범위가 큰 자료형을 작은 자료형으로 변환한다.
        [표현법]
        (자료형) 데이터;
     */
    public void casting(){
        double dNum = 4.123456789;
        // float fNum = dNum; // 에러 발생
        float fNum = (float) dNum;
        int iNum = (int) fNum;

        System.out.println("dNum : " + dNum);
        System.out.println("fNum : " + fNum);
        System.out.println("iNum : " + iNum);
        System.out.println("(byte) 290 : " + (byte) 290);
        System.out.println();

        // int sum = (int) (iNum + dNum);
        int sum = iNum + (int) dNum;
        System.out.println("sum : " + sum);
    }

    /*
    * 실습 문제
    * 홍길동 국어 점수 60점, 영어 점수 70점, 수학 점수 66점을 받았다.
    * 이 학생의 총점과 평균을 출력하세요.
    *
    * 예시)
    * 국어 점수 : 60점
    * 영어 점수 : 70점
    * 수학 점수 : 66점
    *
    * 총점 : 196점
    * 평균 : 65점
    */
    public void practice(){
        int kor = 60;
        int eng = 70;
        int math = 66;

        int sum = kor + eng + math;
        int avg = sum / 3;

        System.out.println("국어 점수 : " + kor +"점");
        System.out.println("영어 점수 : " + eng +"점");
        System.out.println("수학 점수 : " + math +"점");
        System.out.println();
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

    }
    
}
