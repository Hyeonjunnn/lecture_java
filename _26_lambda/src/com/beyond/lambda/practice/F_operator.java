package com.beyond.lambda.practice;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

/**
 * <p>Operator 표준 함수적 인터페이스
 *
 * <p>packageName    : com.beyond.lambda.practice
 * <p>fileName       : F_operator
 * <p>author         : hjsong
 * <p>date           : 2025-01-16
 * <p>description    : Operator 표준 함수적 인터페이스
 */
 /*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-16        hjsong       최초 생성
 */
public class F_operator {
    /*
     * Operator
     * - Operator 표준 함수적 인터페이스는 매개값과 리턴 값이 있는 apply() 추상 메소드를 가지고 있다.
     * */

    public void method1(){
        Student student1 = new Student("홍길동", 25, "남자", 70, 80);
        Student student2 = new Student("성춘향", 25, "여자", 80, 90);
        // IntBinaryOperator : 두 개의 int 값을 연산해서 int 타입의 값을 리턴한다.
        IntBinaryOperator intBinaryOperator;

        intBinaryOperator = (int a, int b) -> {
            return a * b;
        };

        System.out.println(intBinaryOperator.applyAsInt(10, 20));

        // IntUnaryOperator : 한 개의 int 값을 연산해서 int 타입의 값을 리턴한다.
        IntUnaryOperator intUnaryOperator;

        intUnaryOperator = (a) -> a * a * a;

        System.out.println(intUnaryOperator.applyAsInt(2));

        // BinaryOperator<T> : 두 개의 T 타입 객체를 연산해서 T 타입 객체를 리턴한다.
        BinaryOperator<Student> binaryOperator;

        binaryOperator = (Student s1, Student s2) -> {

            return s1.getSum() > s2.getSum() ? s1 : s2;
        };

        System.out.println(binaryOperator.apply(student1, student2));

        // 참고 - 인터페이스의 static 메소드 황용(maxBy())
        BinaryOperator<Student> bo = BinaryOperator.maxBy((Student o1, Student o2) -> Integer.compare(o1.getSum(), o2.getSum()));

        System.out.println(bo.apply(student1, student2));

    }

}
