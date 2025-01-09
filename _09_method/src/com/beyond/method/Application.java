package com.beyond.method;

import com.beyond.method.practice.A_method;
import com.beyond.method.practice.User;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        A_method a_method = new A_method();

        // 1. 매개변수와 반환값이 없는 메소드 호출
        a_method.method1();
        System.out.println();

        // 2. 매개변수가 없고 반환값은 있는 메소드 호출
        String str = a_method.method2();

        System.out.println(str);
        System.out.println();

        // 3. 매개변수가 있고 반환값은 없는 메소드
        a_method.method3(10, 20);
        System.out.println();

        // 4. 매개변수가 있고 반환값도 있는 메소드
        int result = a_method.method4(10,20);

        System.out.printf("10 X 20 = %d\n", result);
        System.out.println();

        // 5. 매개변수로 User 객체를 전달받는 메소드 호출
        User user = new User("hong123", "1234", "홍길동");

        System.out.println(user.information());
        a_method.method5(user);
        System.out.println(user.information());
        System.out.println();

        // 6. 매개변수로 가변인자를 전달받는 메소드 호출
        // System.out.println(a_method.method6(new int[] {1, 2}));
        // System.out.println(a_method.method6(new int[] {1, 2, 3, 4, 5}));
        // System.out.println(a_method.method6(new int[] {}));
        System.out.println(a_method.method6(1, 2));
        System.out.println(a_method.method6(1, 2, 3, 4, 5));
        System.out.println(a_method.method6());
    }

}
