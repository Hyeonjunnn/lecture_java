package com.beyond.lambda.practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

/**
 * <p>메소드 참조
 *
 * <p>packageName    : com.beyond.lambda.practice
 * <p>fileName       : H_methodReference
 * <p>author         : 송현준
 * <p>date           : 2025-01-16
 * @author 송현준
 * <p>description    : 메소드 참조
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-16        송현준             최초 생성
 */
public class H_methodReference {

    /*
    * 메소드 참조
    * - 자바 8부터 도입되어 기존 메소드나 생성자를 참조해서 함수적 인터페이스의 구현 객체를 생성한다.
    * - 람다식에서 불 필요한 매개 변수를 제거하는 것이 메소드 참조의 목적이다.
    * */
    public void method1(){
        // 정적 메소드 참조
        // - 클래스 이름 뒤에 :: 붙이고 정적 메소드 이름을 기술하면 된다.
        // IntBinaryOperator binaryOperator = (a, b) -> Math.max(a,b);
        IntBinaryOperator binaryOperator = Math::max;

        System.out.println(binaryOperator.applyAsInt(10, 20));
        
        // 객체의 메소드 참조
        // - 참조 변수 뒤에 :: 붙이고 메소드 이름을 기술하면 된다.
        // Consumer<String> consumer = (str) -> System.out.println(str);
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello World!!");

        // 매개변수의 메소드 참조
        // - 매개변수의 클래스 이름 뒤에 :: 붙이고 메소드 이름을 기술하면 된다.
        // Function<Student, String> function = student -> student.getName();
        Function<Student, String> function = Student::getName;

        System.out.println(function.apply(new Student("임꺽정", 20)));
        
        // 생성자 참조
        // - 클래스 이름 뒤에 :: 붙이고 new 연산자를 기술하면 된다.
        // Supplier<Student> supplier = () -> new Student();
        Supplier<Student> supplier = Student::new;

        System.out.println(supplier.get());
    }

}
