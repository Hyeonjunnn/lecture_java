package com.beyond.control;

import com.beyond.control.practice.A_if;
import com.beyond.control.practice.B_switch;
import com.beyond.control.practice.C_for;
import com.beyond.control.practice.D_while;

public class Application {
    public static void main(String[] args) {

        A_if a_if = new A_if();
        // a_if.method1();
        // a_if.method2();
        // a_if.method3();
        // a_if.practice();

        B_switch b_switch = new B_switch();
        // b_switch.method1();
        // b_switch.method2();
        // b_switch.practice();

        C_for c_for = new C_for();
        // c_for.method1();
        // c_for.method2();
        // c_for.method3();

        D_while d_while = new D_while();
        // d_while.method1();
        d_while.method2();
    }

}
