package com.beyond.lambda.practice.functional;

/**
 * C_funtional 인터페이스입니다.
 *
 * <p>
 * @author hjsong
 * @version 2025.01.16
 * */
@FunctionalInterface
public interface C_functional {
    /**
     * 매개변수, 반환값이 있는 추상 메소드입니다.
     *
     * @param x 
     *      구현체에서 사용될 매개변수
     * @param y
     *      구현체에서 사용될 매개변수
     * @return
     *      구현체에서 반환하는 반환값
     * */
    int execute(int x, int y);
}
