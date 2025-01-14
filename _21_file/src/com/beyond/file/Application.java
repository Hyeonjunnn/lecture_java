package com.beyond.file;

import com.beyond.file.practice.A_file;

public class Application {
    public static void main(String[] args) {

        A_file a_file = new A_file();
        System.out.println("프로그램 시작");

        // a_file.method1();
        a_file.method2();
        
        System.out.println("프로그램 종료");
    }
}
