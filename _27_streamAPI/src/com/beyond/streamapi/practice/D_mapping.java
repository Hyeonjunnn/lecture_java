package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * <p>중간 처리 메소드(매핑)
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : D_mapping
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 중간 처리 메소드(매핑) 테스트
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class D_mapping {

    /*
    * 매핑
    * - 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할을 한다.
    * */

    /**
     *
     *
     * <p>author : hjsong
     * <p>date   : 2025-01-17
     */
     public void method1(){
         int sum = 0;
         List<Student> students = Arrays.asList(
                 new Student("홍길동", 24, "남자", 80, 50),
                 new Student("김철수", 20, "남자", 50, 50),
                 new Student("김영희", 20, "여자", 90, 90),
                 new Student("홍길동", 24, "남자", 80, 50),
                 new Student("이몽룡", 26, "남자", 80, 80)
         );
         
         // 학생들의 이름을 출력
         // students.stream()
         //         .distinct()
         //         .map((student) -> student.getName())
         //         .forEach(System.out::println);

         students.stream()
                 .distinct()
                 .map(Student::getName)
                 .forEach(System.out::println);
         System.out.println();

         // 학생들의 수학 점수의 합계
         sum = students.stream()
                 .distinct()
                 .mapToInt((student) -> student.getMath())
                 .sum();
         System.out.println(sum);
         System.out.println();

         // sum = students.stream()
         //         .distinct()
         //         .mapToInt(Student::getMath)
         //         .sum();
         // System.out.println(sum);
         // System.out.println();


     } // method1 END

    /**
     *
     *
     * <p>author : hjsong
     * <p>date   : 2025-01-17
     */
    public void method2(){
        int[] iNumber = {1, 2, 3, 4, 5};
        double[] dNumber = {1.1, 2.2, 3.3, 4.4, 5.5};

        Arrays.stream(iNumber)
                // .asDoubleStream()
                .asLongStream()
                .forEach(System.out::println);
        System.out.println();

        // 오름차순 정렬
        Arrays.stream(dNumber)
                .boxed()
                .sorted()
                .forEach(System.out::println); // forEach는 최종 처리 메소드
        System.out.println();

        // 중간 처리 메소드는 최종 처리 메소드가 호출되어야 동작한다.
        double sum = Arrays.stream(dNumber)
                .boxed()
                .sorted(Comparator.reverseOrder())
                // .mapToDouble((number) -> number.doubleValue())
                // .mapToDouble((number) -> number) // 기본형 double 이지만 Double로 오토언박싱 발생으로 사용가능
                .mapToDouble(Double::doubleValue)
                .peek(System.out::println) // peek은 중간 처리 메소드
                .sum();
        System.out.println(sum);
        System.out.println();
    }

}
