package com.beyond.constructor;

import com.beyond.constructor.practice.User;

public class Application {
    public static void main(String[] args) {
        User user;

        // 기본 생성자로 객체 생성
        user = new User();

        String information = user.information();
        System.out.println(information);

        // 매개변수가 있는 생성자로 객체 생성 (3개의 값을 생성자로 전달)
        user = new User("hong123", "1234", "홍길동");

        System.out.println(user.information());

        user = new User("gil123", "1234", "길동", 1, 'M');

        System.out.println(user.information());
    }
}
