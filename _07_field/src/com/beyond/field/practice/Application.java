package com.beyond.field.practice;

public class Application{
    public static void main(String[] args) {
        // 1. 접근 제한자 테스트
        User user = new User();

        // 1) public    : 어디서든 필드에 직접 접근이 가능하다.
        System.out.println(user.id); // 'hong' 출력

        // 2) protected : 같은 패키지, 자식 클래스에서만 직접 접근이 가능하다.
        user.address = "서울특별시";
        System.out.println(user.address); // '서울특별시' 출력

        // 3) default   : 같은 패키지 내에서만 직접 접근이 가능하다.
        user.name = "이몽룡";
        System.out.println(user.name); // '이몽룡' 출력

        // 4) private   : 클래스 내에서만 직접 접근이 가능하다.
        // System.out.println(user.password); // 에러
    }
}
