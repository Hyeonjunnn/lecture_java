package com.beyond.lambda.practice.functional;

/**
 * A_functional 인터페이스입니다.
 *
 * <p>{@code functionalInterface}이며 추가적인 메소드는 존재하지 않습니다.
 *
 * @author hjsong
 * @version 2025.01.16
 * */
@FunctionalInterface
public interface A_functional {
    // 매개변수, 반환값이 없는 추상 메소드
    /**
     * 매개변수, 반환값이 없는 추상 메소드입니다.
     * */
    void execute();

    // void otherMethod();
}
