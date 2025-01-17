package com.beyond.lambda;

import com.beyond.lambda.practice.A_lambda;
import com.beyond.lambda.practice.B_functionalInterface;
import com.beyond.lambda.practice.C_consumer;
import com.beyond.lambda.practice.D_supplier;
import com.beyond.lambda.practice.E_function;
import com.beyond.lambda.practice.F_operator;
import com.beyond.lambda.practice.G_predicate;
import com.beyond.lambda.practice.H_methodReference;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 이 클래스는 Application 클래스입니다.
 *
 * @author hjsong
 * @version 2025.01.16
 * */
public class Application {
    /*
    * 람다식(Lambda Expressions)
     *
     * <p>
    * [표현법]
    * ([자료형 매개변수, ...]) ->{
    *
    *   [return 반환값;]
    * };
    *
    * 예시)
    * - () -> {...}
    * - (int a) -> { System.out.println(a); }
    * - (a) -> { System.out.println(a); }       // 매개변수 자료형 생략가능
    * - a -> { System.out.println(a); }         // 매개변수 하나일 경우 괄호까지 생략가능
    * - a -> System.out.println(a);             // 코드 블럭이 한 줄일 경우 중괄호 생략가능
    * - (int a, int b) -> { return a + b;}
    * - (a,b) -> { return a + b; }
    * - (a,b) -> a + b;
    * */
    public static void main(String[] args) {
        A_lambda a_lambda = new A_lambda();
        // a_lambda.method1();

        // 함수적 인터페이스 테스트
        B_functionalInterface b_functionalInterface = new B_functionalInterface();
        // b_functionalInterface.method1();
        // b_functionalInterface.method2();
        // b_functionalInterface.method3();
        // b_functionalInterface.method4(300);

        // 표준 함수적 인터페이스 테스트
        C_consumer c_consumer = new C_consumer();
        // c_consumer.method1();

        // Supplier 표준 함수적 인터페이스 테스트
        D_supplier d_supplier = new D_supplier();
        // d_supplier.method1();

        // Function 표준 함수적 인터페이스 테스트
        E_function e_function = new E_function();
        // e_function.method1();

        // Operator 표준 함수적 인터페이스
        F_operator f_operator = new F_operator();
        f_operator.method1();

        // Predicate 표준 함수적 인터페이스
        G_predicate g_predicate = new G_predicate();
        // g_predicate.method1();

        // 메소드 참조
        H_methodReference h_methodReference = new H_methodReference();
        h_methodReference.method1();

    }

}
