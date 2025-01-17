package com.beyond.lambda.practice.functional;

/**
 * B_functional 인터페이스입니다.
 * */
@FunctionalInterface
public interface B_functional {
    
    // 매개변수가 있고 반환값이 없는 추상 메소드
    /**
     * 매개변수가 있고 반환값이 없는 추상 메소드 구현체 입니다.
     *
     * @param a
     *      제곱을 위한 매개변수
    * */
    void execute(int a);
}
