package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();
        // Phone phone = new Phone();// Phone 클래스는 default로 접근 제한

        person.setName("홍길동");
        person.setAge(32);
        person.setPhone("아이폰11pro", "스페이스 그레이", "Apple");

        person.whoAreYou();

    }

}
