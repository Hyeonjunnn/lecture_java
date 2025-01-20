package com.beyond.streamapi.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * <p>학생 클래스
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : Student
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 학생 정보가 담긴 클래스
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
// @Data
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>{
    private String name;

    private int age;

    private String gender;

    private int math;

    private int english;

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }

    public int getSum(){
        return math + english;
    }

    public double getAvg(){
        return getSum() / 2.0;
    }
}
