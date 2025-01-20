package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>최종 처리 메소드(수집)
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : G_collect
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 최종 처리 메소드(수집) 테스트
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class G_collect {

    /*
    * 수집
    * - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
    * */

    /**
     *
     *
     * <p>author         : hjsong
     * <p>date           : 2025-01-17
     */
    public void method1(){
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("이몽룡", 26, "남자", 80, 80),
                new Student("성춘향", 20, "여자", 100, 100)
        );

        // 학생들의 이름만 List 컬렉션으로 추출
        List<String> names = students.stream()
                                    // .map((student) -> student.getName())
                                    .map(Student::getName)
                                    .collect(Collectors.toList());
        System.out.println(names);
        System.out.println();

        // 남학생들만 List 컬렉션으로 추출
        List<Student> list = students.stream()
                                    .filter((student) -> student.getGender().equals("남자"))
                                    .toList();
        list.forEach(System.out::println);
        System.out.println();
        
        // 여학생들만 Set 컬렉션으로 추출
        Set<Student> set = students.stream()
                                .filter((student) -> student.getGender().equals("여자"))
                                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println();

        // Map 컬렉션으로 수집 (key: 이름, value: Student 객체)
        // Map<String, Student> map = students.stream()
        //                                 .collect(Collectors.toMap(s -> s.getName(), s -> s));

        Map<String, Student> map = students.stream()
                                        .collect(Collectors.toMap(Student::getName, Function.identity()));

        map.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();

        Map<String, List<Student>> listmap = students.stream()
                                                    .collect(Collectors.groupingBy(Student::getGender));

        listmap.forEach((s, studentList) -> {
            System.out.println(s);
            studentList.forEach(System.out::println);
            System.out.println();
        });
    }

}
