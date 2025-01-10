package com.beyond._exception;

import com.beyond._exception.practice.A_tryCatchFinally;
import com.beyond._exception.practice.B_throws;
import com.beyond._exception.practice.C_runtimeException;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("프로그램 시작");

        // A_tryCatchFinally a_tryCatchFinally = new A_tryCatchFinally();
        // a_tryCatchFinally.method1();

        B_throws b_throws = new B_throws();
        // try {
        //     b_throws.method1();
        // } catch (IOException e) {
        //     System.out.println("IOException 예외 발생");
        // } catch (ClassNotFoundException e) {
        //     System.out.println("ClassNotFoundException 예외 발생");
        // }

        // b_throws.method1();

        C_runtimeException c_runtimeException = new C_runtimeException();
        c_runtimeException.method1();

        System.out.println("프로그램 종료");
    }

}
