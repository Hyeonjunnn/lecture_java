package com.beyond.api.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C_dateTime {
    /*
    * Date 클래스
    * - 날짜와 시간을 표현하는 클래스이다.
    * - 주로 객체 간에 날짜와 시간 정보를 주고 벋을 때 사용한다.
    */
    public void method1(){
        // 현재 시스템의 날짜와 시간에 대한 정보를 가지고 객체를 생성한다.
        Date today = new Date();
        // 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위로 표기된다.
        // Date when = new Date(1L);
        Date when = new Date((2025 - 1900), (1 - 1), 13 );

        System.out.println(today);
        System.out.println(when);
        System.out.println();

        System.out.println(today.getTime());
        System.out.println(today.getYear() + 1900);
        System.out.println(today.getMonth() + 1);
        System.out.println(today.getDate());
        System.out.println();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(today));
        System.out.println();
    }

    /*
    * java.time 패키지
    * - 자바 1.8부터 날짜와 시간을 나타내는 java.time 패키지를 제공한다.
    *
    * LocalDateTime
    * - 날짜와 시간 정보를 모두 저장할 수 있는 객체를 생성하는 클래스이다.
    * 
    * LocalDate
    * - 날짜 정보를 저장할 수 있는 객체를 생성하는 클래스이다.
    *
    * LocalTime
    * - 시간 정보를 저장할 수 있는 객체를 생성하는 클래스이다.
    */
    public void method2(){
        // 현재 날짜와 시간 정보를 저장한 객체를 생성한다.
        LocalDateTime now = LocalDateTime.now();
        // 매개값으로 주어진 날짜와 시간 정보를 저장한 객체를 생성할 수 있다.
        // LocalDateTime when = LocalDateTime.of(2025, 1, 13, 12, 32, 30);
        LocalDateTime when = LocalDateTime.parse("2025-03-23T12:32:30.1234");

        System.out.println(now);
        System.out.println(when);
        System.out.println(ZonedDateTime.now());
        System.out.println();

        // 날짜와 시간에 대한 정보 출력
        System.out.println(when.getYear());
        System.out.println(when.getMonth());
        System.out.println(when.getMonthValue());
        System.out.println(when.getDayOfMonth());
        System.out.println(when.getDayOfWeek());
        System.out.println(when.getDayOfYear());
        System.out.println(when.getHour());
        System.out.println(when.getMinute());
        System.out.println(when.getSecond());
        System.out.println(when.getNano());
        System.out.println();

        // 날짜와 시간을 조작하는 메소드
        // LocalDateTime plusDays = now.plusDays(1);
        LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(1);
        LocalDateTime minusMonths = now.minusMonths(2);

        System.out.println(now);
        System.out.println(plusDays);
        System.out.println(minusMonths);
        System.out.println();
        
        // 날짜와 시간을 비교하는 메소드
        System.out.println(now.isAfter(plusDays));
        System.out.println(now.isBefore(plusDays));
        System.out.println(now.isEqual(plusDays));
        System.out.println(now.isAfter(minusMonths));
        System.out.println(now.isBefore(minusMonths));
        System.out.println(now.isBefore(minusMonths));
        System.out.println();

        // 날짜 정보를 저장하는 객체
        // LocalDate today = LocalDate.now();
        // LocalDate today = LocalDate.of(2025, 1, 13);
        LocalDate today = LocalDate.parse("2025-01-13");

        System.out.println(today);
        System.out.println();

        // 시간 정보를 저장하는 객체
        // LocalTime todayTime = LocalTime.now();
        // LocalTime todayTime = LocalTime.of(20, 30, 30);
        // LocalTime todayTime = LocalTime.parse("20:30:30");
        LocalTime todayTime = now.toLocalTime();

        System.out.println(today);
        System.out.println(todayTime);
        System.out.println();

        // DateTimeFormatter 클래스 사용
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");

        System.out.println(now);
        System.out.println(now.format(formatter));
        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(LocalDate.parse("2025-W03-1", DateTimeFormatter
                .ISO_WEEK_DATE));
        System.out.println();
    }


}
