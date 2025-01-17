package com.beyond.lambda.practice;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * <p>Predicate 표준 함수적 인터페이스
 *
 * <p>packageName    : com.beyond.lambda.practice
 * <p>fileName       : G_predicate
 * <p>author         : hjsong
 * <p>date           : 2025-01-16
 * <p>description    : Predicate 표준 함수적 인터페이스
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-16        hjsong       최초 생성
 */
public class G_predicate {
    /*
    * Predicate
    * - Predicate 표준 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 test() 추상 메소드를 가지고 있다.
    * - test() 추상 메소드는 매개값을 조사해서 true/false를 리턴하는 역할을 한다.
    * */
    public void method1() {
        // Predicate<T> : T 타입의 객체를 조사해서 true 또는 false를 리턴한다.
        Predicate<String> predicate = (String str) -> str.equals("홍길동");

        System.out.println(predicate.test("이몽룡"));
        System.out.println(predicate.test("홍길동"));


        // BiPredicate<T, U) : T 타입의 객체와 U 타입의 객체를 조사해서 true 또는 false를 리턴한다.
        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);

        System.out.println(biPredicate.test("이몽룡", "홍길동"));
        System.out.println(biPredicate.test("이몽룡", "이몽룡"));


    }

}
