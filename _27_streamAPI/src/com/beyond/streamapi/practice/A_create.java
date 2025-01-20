package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <p>스트림
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : A_create
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 스트림 생성 테스트
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class A_create {
    /*
    * 스트림의 종류
    * - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이
    * - Stream<T>, IntStream, LongStream, DoubleStream
    * */

    /**
     * 숫자 범위로 스트림을 생성하는 방법
     *
     * <p>author         : hjsong
     * <p>date           : 2025-01-17
     */
    public void method1(){
        int sum = 0;
        IntStream stream = null;

        // 첫 번째 매개값 ~ 두 번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다.
        // stream = IntStream.range(1, 10);
        stream = IntStream.rangeClosed(1, 10);

        // sum = stream.sum();
        // sum = stream.peek((value) -> System.out.println(value)).sum();
        sum = stream.peek(System.out::println).sum();

        System.out.printf("sum = %d\n", sum);
        System.out.println();
        
    } // method1 END

    /**
     * 배열로부터 스트림을 생성하는 방법
     *
     * <p>author         : hjsong
     * <p>date           : 2025-01-17
     */
    public void method2(){
        String[] names = {"홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향"};

        // for 문을 사용하여 출력
        for (String str : names){
            System.out.println(str);
        }
        System.out.println();

        // 스트림을 사용하여 출력
        // Stream<String> stream = Arrays.stream(names);
        // Stream<String> stream = Arrays.<String>stream(names);
        // Stream<String> stream = Stream.<String>of(names);
        Stream<String> stream = Stream.<String>of("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");

        // stream.forEach((String str) -> {
        //     System.out.println(str + " ");
        // });
        // stream.forEach(str -> System.out.print(str + " "));
        // stream.distinct().forEach(str -> System.out.print(str + " ")); // 중복 제거
        stream.parallel().forEach(str -> System.out.print(str + " ")); // 많은 데이터 처리에 유용

        System.out.println();
    } // method2 END

    /**
     * 컬렉션으로부터 스트림을 생성하는 방법
     *
     * <p>author         : hjsong
     * <p>date           : 2025-01-17
     */
    public void method3(){
        List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");

        // for 문을 사용하여 출력
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        } // for i END
        System.out.println();

        // 스트림을 사용하여 출력
        // Stream<String> stream = names.stream();
        Stream<String> stream = names.parallelStream();

        // stream.forEach((name) -> System.out.print(name + " "));
        stream.forEach(System.out::println);
        System.out.println();
    } // method3 END

}
