package com.beyond.abstractClass;

import com.beyond.abstractClass.practice.BasketBall;
import com.beyond.abstractClass.practice.FootBall;
import com.beyond.abstractClass.practice.Sports;

public class Application {
    private static Sports footBall;

    public static void main(String[] args) {
        // 추상 클래스는 객체 생성이 불가능하다.
        // Sports sport = new Sports(5);

        // 추상 클래스는 참조 변수로 사용이 가능하다.
        // 즉, 다형성을 적용해서 자식 객체를 참조할 수 있다.
        Sports basketBall = new BasketBall(5);
        Sports footBall = new FootBall(11);

        Sports[] sports = {
                basketBall,
                footBall
        };

        for (Sports s : sports){
            // s.rule();
            printRule(s);
        }

    }

    private static void printRule(Sports sports){
        sports.rule();
    }
}
