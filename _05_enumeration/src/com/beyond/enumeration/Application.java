package com.beyond.enumeration;

import com.beyond.enumeration.practice.Week;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // Week today = null;
        // today = Week.TUESDAY;
        Week today = Week.FRIDAY;

        // 열거 상수에서 제공하는 메소드
        System.out.println(today.name());                   // FRIDAY   -- Week today = Week.FRIDAY; 기준
        System.out.println(today.ordinal());                // 4        -- Week today = Week.FRIDAY; 기준
        System.out.println(today.equals(Week.MONDAY));      // false    -- Week today = Week.FRIDAY; 기준
        System.out.println(today.compareTo(Week.MONDAY));   // 4        -- Week today = Week.FRIDAY; 기준
        
        // 열거 타입에서 기본적으로 제공하는 정적 메소드

        // Week saturday = Week.valueOf("SATURDAY");
        // System.out.println(saturday.name());
        System.out.println(Week.valueOf("SATURDAY").name()); // 인텔리제이 shortcut [ctrl + alt + n] : 변수 인라인화

        // Week[] values = Week.values();
        // System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(Week.values())); // 인텔리제이 shortcut [ctrl + alt + n] : 변수 인라인화
        System.out.println();

        // 열거 타입에 속성 추가 후 확인
        System.out.println(today.getName());
        System.out.println(today.getShortName());
        System.out.println(today.getValue());

    }

}
