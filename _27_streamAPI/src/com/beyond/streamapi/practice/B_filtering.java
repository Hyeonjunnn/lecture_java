package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * <p>중간 처리 메소드(필터링)
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : B_filtering
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 중간 처리 메소드(필터링) 테스트
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class B_filtering {
    /*
    * 필터링
    * - 필터링은 중간 처리 기능으로 요소를 잘라내는 역할을 한다.
    * - distinct() 메소드는 참조의 중복을 제거하는 메소드이다.
    * - filter(Predicate) 메소드는 매개값으로 전달되는 Predicate가 false를 리턴하는 참조를 제거한다.
    * */

    /**
     * 중복 제거 테스트
     *
     * <p>author : hjsong
     * <p>date   : 2025-01-17
     */
    public void method1(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 80, 80)
        );

        Stream<Student> stream = students.stream();

        // stream.forEach((student) -> System.out.println(student));
        stream.forEach(System.out::println);
        System.out.println();

        // 이미 최종 처리 메소드까지 호출된 스트림은 다시 사용할 수 없다.
        // 리스트로부터 다시 스트림을 얻어야 한다.
        // stream.forEach(System.out::println); // 에러

        // students.stream().distinct().forEach((student) -> System.out.println(student));
        students.stream().distinct().forEach(System.out::println);
    }

    /**
     * 필터 메소드 테스트
     *
     * <p>author : hjsong
     * <p>date : 2025-01-17
     */
    public void method2(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 80, 80)
        );

        // 성별이 여자인 학생만 출력
        students.stream()
                .distinct()
                .filter((student) -> student.getGender().equals("여자"))
                .forEach(System.out::println);
        System.out.println();

        // 수학, 영어 점수가 둘 다 60점 이상인 학생만 출력
        students.stream()
                .distinct()
                .filter((student) -> (student.getMath() >= 60) && (student.getEnglish() >= 60))
                .forEach(System.out::println);
        System.out.println();
    } // method2 END

}
