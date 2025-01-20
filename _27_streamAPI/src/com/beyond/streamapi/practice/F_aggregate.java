package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * <p>최종 처리 메소드(집계)
 *
 * <p>packageName    : com.beyond.streamapi.practice
 * <p>fileName       : F_aggregate
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    : 최종 처리 메소드(집계) 테스트
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class F_aggregate {

    /*
    * 기본 집계
    * - 최종 처리 기능으로 요소들의 개수, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할을 한다.
    *   - count()
    *   - sum()
    *   - average()
    *   - max()
    *   - min()
    *   - findFirst()
    *
    * 커스텀 집계
    * - 기본 집계 이외의 다양한 집계 결과물을 산출하는 역할을 한다.
    *   - reduce()
    *
    * Optional 클래스
    * - 스트림의 최종 결과 값을 저장하는 객체이다.
    * - 단순히 값만 저장하는 것 아니라, 갑스이 존재 여부를 확인하고 값이 존재하지 ㅇ낳을 경우
    *   기본 값을 설정할 수 있는 객체이다.
    * */

    /**
     *
     *
     * <p>author         : hjsong
     * <p>date           : 2025-01-17
     */
    public void method1(){
        int[] numbers = {1, 2, 3, 4, 5, 6};
        // int[] numbers = {1, 3, 5};

        // 1. 기본 집계
        long count = Arrays.stream(numbers).filter((number) -> number % 2 == 0).count();
        System.out.printf("2의 배수의 개수 : %d\n", count);

        int sum = Arrays.stream(numbers).filter((number) -> number % 2 == 0).sum();
        System.out.printf("2의 배수의 합 : %d\n", sum);

        OptionalDouble optionalDouble =
                Arrays.stream(numbers).filter((number) -> number % 2 == 0).average();

        // get() 메소드는 Optional 객체에 저장된 값을 가져온다.
        // System.out.printf("2의 배수의 평균 : %.1f\n", optionalDouble.getAsDouble());

        // isPresent() 메소드로 값의 존재 여부를 확인할 수 있다.
        // if (optionalDouble.isPresent()) {
        //     System.out.printf("2의 배수의 평균 : %.1f\n", optionalDouble.getAsDouble());
        // } else {
        //     System.out.println("2의 배수의 평균 : 0");
        // }

        // ifPresent() 메소드는 집계 값을 처리하는 Consumer를 등록한다.(단, 값이 존재해야 실행된다.)
        // optionalDouble.ifPresent((value) -> System.out.println(value));
        // optionalDouble.ifPresent(System.out::println);
        // optionalDouble.ifPresent((value) -> System.out.printf("2의 배수의 평균 : %.1f\n", value));

        // orElse() 메소드는 get() 메소드와 동일하게 저장되어 있는 값을 얻어오는 메소드이다.
        // 단, 값이 저장되어 있지 않을 경우 리턴 받을 디폴트 값을 지정할 수 있다.
        System.out.printf("2의 배수의 평균 : %.1f\n", optionalDouble.orElse(0.0));

        OptionalInt optionalInt = Arrays.stream(numbers)
                .filter((number) -> number % 2 == 0)
                .min();
        System.out.printf("2의 배수의 최솟값 : %d\n", optionalInt.orElse(0));

        optionalInt = Arrays.stream(numbers)
                .filter((number) -> number % 2 == 0)
                .max();
        System.out.printf("2의 배수의 최댓값 : %d\n", optionalInt.orElse(0));

        optionalInt = Arrays.stream(numbers)
                .filter((number) -> number % 2 == 0)
                .findFirst();
        System.out.printf("2의 배수의 첫 번째 요소의 값 : %d\n", optionalInt.orElse(0));

        // 2. 커스텀 집계
        Arrays.stream(numbers)
                .filter((number) -> number % 2 == 0)
                .reduce((left, right) -> left * right)
                .ifPresent((value) -> System.out.printf("2의 배수의 곱 : %d\n", value));

        int result = Arrays.stream(numbers)
                .filter((number) -> number % 2 == 0)
                .reduce(3, (left, right) -> left * right);
        System.out.println(result);
    }

}
