package com.beyond.lambda.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    @NonNull
    private String name;
    // private final String name;

    @NonNull
    private int age;

    private String gender;
    private int math;

    private int english;

    public int getSum(){
        return math + english;
    }

    public int getAvg(){
        return getSum() / 2;
    }

}
