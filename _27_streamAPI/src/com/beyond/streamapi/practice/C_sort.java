package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * <p>중간 처리 메소드(정렬)
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : C_sort
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 중간 처리 메소드(정렬) 테스트
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class C_sort {
    /*
    * 정렬
    * - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 정렬할 수 있다.
    * - IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다.
    * - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해야 정렬할 수 있다.
    * */

    /**
     * 요소가 기본 자료형일 때
     *
     * <p>author : hjsong
     * <p>date   : 2025-01-17
     */
    public void method1(){
        // 오름차순 정렬
        IntStream.of(3, 5, 1, 4, 2)
                .sorted()
                .forEach((value) -> System.out.print(value + " "));

        System.out.println();

        // 내림차순 정렬
        IntStream.of(3, 5, 1, 4, 2)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach((value) -> System.out.print(value + " "));

        System.out.println();
    }

    /**
     * 요소가 객체일 때
     *
     * <p>author : hjsong
     * <p>date   : 2025-01-17
     */
    public void method2(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 80, 80)
        );

        // 오름차순 정렬(나이)
        // students.stream()
        //         .distinct()
        //         .sorted()
        //         .forEach(System.out::println);
        // System.out.println();

        // students.stream()
        //         .distinct()
        //         .sorted((o1, o2) -> o1.compareTo(o2))
        //         .forEach(System.out::println);
        // System.out.println();

        // students.stream()
        //         .distinct()
        //         .sorted(Student::compareTo)
        //         .forEach(System.out::println);
        // System.out.println();

        // 오름차순 정렬(이름)
        students.stream()
                .distinct()
                .sorted((o1, o2) -> {
                    return o1.getName().compareTo(o2.getName());
                })
                .forEach(System.out::println);
        System.out.println();
        
        // 내림차순 정렬(나이)
        // students.stream()
        //         .distinct()
        //         .sorted(Collections.reverseOrder())
        //         .forEach(System.out::println);
        // System.out.println();

        // students.stream()
        //         .distinct()
        //         .sorted((o1, o2) -> o2.compareTo(o1))
        //         .forEach(System.out::println);
        // System.out.println();

        // 내림차순 정렬(이름)
        students.stream()
                .distinct()
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .forEach(System.out::println);
        System.out.println();
    }

}
