package com.beyond.staticMember;

import com.beyond.staticMember.practice.A_staticField;
import com.beyond.staticMember.practice.B_staticMethod;
import com.beyond.staticMember.practice.C_staticFinalField;

public class Application {
    public static void main(String[] args) {
        // 정적 필드 테스트
        // 정적 필드는 객체들이 공유하면서 사용할 목적으로 선언한다.
        // 정적 필드는 프로그램이 실행될 때 해당 클래스가 로드되면서 생성되고, 프로그램아 종료될 때 소멸된다.
        System.out.println(A_staticField.number);
        System.out.println();

        // 1. 객체의 정적 필드 공유
        A_staticField staticField1 = new A_staticField();
        A_staticField staticField2 = new A_staticField();

        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        A_staticField.number++;

        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        // 2. 정적 필드의 Getter와 Setter
        System.out.println(A_staticField.getMessage());
        A_staticField.setMessage("메시지 변경!");
        System.out.println(A_staticField.getMessage());
        System.out.println();
        
        // 정적 메소드 호출
        // 1. 매개변수와 반환값이 없는 정적 메소드 호출
        B_staticMethod.method1();
        B_staticMethod.method1();
        System.out.println();
        
        // 2. 매개변수가 없고 반환값이 있는 정적 메소드 호출
        System.out.println(B_staticMethod.method2());
        System.out.println();

        // 3. 매개변수가 있고 반환값이 없는 정적 메소드
        B_staticMethod.method3(30);
        System.out.println();

        // 4. 매개변수가 있고 반환값도 있는 정적 메소드
        System.out.println(B_staticMethod.method4());
        System.out.println(B_staticMethod.method4(4, 5));
        System.out.println(B_staticMethod.method4(4, 5, 20, 40));
        System.out.println();

        // final 필드 테스트
        C_staticFinalField c_staticFinalField1 = new C_staticFinalField("남자");
        C_staticFinalField c_staticFinalField2 = new C_staticFinalField("여자");

        System.out.println(c_staticFinalField1.getGender());
        System.out.println(c_staticFinalField2.getGender());
        System.out.println();
        
        // 상수 필드 테스트
        System.out.println(C_staticFinalField.MAX_LEVEL);
        System.out.println(Math.PI);
        System.out.printf("Byte의 표현 범위는 %d ~ %d 입니다.\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Integer의 표현 범위는 %d ~ %d 입니다.\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Float의 표현 범위는 %f ~ %f 입니다.\n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Char의 표현 범위는 %d ~ %d 입니다.\n", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.println();

        // final 키워드로 인해서 값을 변경할 수 없다.
    }

}
