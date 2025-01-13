package com.beyond.api;

import com.beyond.api.practice.A_string;
import com.beyond.api.practice.B_wrapper;
import com.beyond.api.practice.C_dateTime;

public class Application {
    public static void main(String[] args) {
        
        // 문자열과 관련 클래스
        A_string a_string = new A_string();
        // a_string.method1();
        // a_string.method2();
        
        // Wrapper 클래스
        B_wrapper b_wrapper = new B_wrapper();
        // b_wrapper.method1();
        
        // 날짜와 시간과 관련된 클래스
        C_dateTime c_dateTime = new C_dateTime();
        // c_dateTime.method1();
        c_dateTime.method2();
    }
}
