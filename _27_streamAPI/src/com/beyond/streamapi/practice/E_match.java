package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;

/**
 * <p>최종 처리 메소드(매칭)
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : E_match
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 최종 처리 메소드(매칭) 테스트
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class E_match {

    /*
    * 매칭
    * - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할을 한다.
    * - allMatch(Predicate)
    * - 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
    * - anyMatch(Predicate)
    * - 참조된 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
    * - noneMatch(Predicate)
    * - 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다.
    * */

    /**
     *
     *
     * <p>author : hjsong
     * <p>date   : 2025-01-17
     */
    public void method1(){
        boolean result = false;
        int[] numbers = {2, 4, 6};

        // allMatch()
        result = Arrays.stream(numbers).allMatch((number) -> number % 2 == 0);
        System.out.println(result); // true

        result = Arrays.stream(numbers).allMatch((number) -> number % 3 == 0);
        System.out.println(result); // false

        // anyMatch()
        result = Arrays.stream(numbers).anyMatch((number) -> number % 3 == 0);
        System.out.println(result); // true

        result = Arrays.stream(numbers).anyMatch((number) -> number % 5 == 0);
        System.out.println(result); // false

        // noneMatch()
        result = Arrays.stream(numbers).noneMatch((number) -> number % 5 == 0);
        System.out.println(result); // true

        result = Arrays.stream(numbers).noneMatch((number) -> number % 2 == 0);
        System.out.println(result); // false
    }

    /**
     *
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

        // 남학생들 중에 평균이 80점 이상인 학생이 한 명이라도 존재하는지 확인하시오.
        boolean result = false;
        result = students.stream()
                .distinct()
                .filter((student) -> student.getGender().equals("남자"))
                .peek(System.out::println)
                .anyMatch((student) -> student.getAvg() >= 80);
        System.out.printf("남학생들 중에 평균이 80점 이상인 학생이 한 명이라도 존재? : " + result + "\n");
        System.out.println();

        // 나이가 20살 이상인 학생들이 모두 남자인지 확인하시오.
        result = false;
        result = students.stream()
                .distinct()
                .filter((student) -> student.getAge() >= 20)
                .peek(System.out::println)
                .allMatch((student) -> (student.getGender().equals("남자")));
        System.out.printf("나이가 20살 이상인 학생들이 모두 남자? : " + result + "\n");
        System.out.println();
    }

}
