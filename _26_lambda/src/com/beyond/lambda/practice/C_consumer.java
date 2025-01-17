package com.beyond.lambda.practice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/**
 * 표준 함수적 인터페이스
 *
 * <p>C_consumer 클래스입니다.
 *
 * @author hjsong
 * @version 2025.01.16
 * */
public class C_consumer {
    /*
    * Consumer
    * - Consumer 표준 함수적 인터페이스는 리턴 값이 없는 accept() 추상 메소드를 가지고 있다.
    * - accept() 추상 메소드는 단지 매개값을 소비하는 역할을 한다.
    */
    public void method1(){
        // Consumer<T> : T 타입의 객체를 받아서 소비한다.
        Consumer<String> consumer = str -> System.out.println(str);

        consumer.accept("Consumer는 한 개의 매개값을  받아서 소비한다.");

        // BiConsumer<T, U> : T, U 타입의 객체를 받아서 소비한다.
        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);

        // biConsumer = (String str1, String str2) -> {
        //     System.out.println(str1 + str2);
        // };

        biConsumer.accept("BiConsumer는 ", " 두 개의 매개 값을 받아서 소비한다.");

        // DoubleConsumer : double 타입의 값을 받아서 소비한다.
        // DoubleConsumer dConsumer = number -> System.out.println(number);;
        DoubleConsumer dConsumer = System.out::println;

        dConsumer.accept(3.14);

        // ObjIntConsumer<T> : T 타입의 객체와 int 타입의 값을 받아서 소비한다.
        ObjIntConsumer<String> objIntConsumer;

        objIntConsumer = (String str, int number) -> {
            System.out.println("ObjIntConsumer");
            System.out.printf("%s %d\n", str, number);
        };

        objIntConsumer.accept("Java", 21);
    }

}
