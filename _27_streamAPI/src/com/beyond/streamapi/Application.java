package com.beyond.streamapi;

import com.beyond.streamapi.practice.A_create;
import com.beyond.streamapi.practice.B_filtering;
import com.beyond.streamapi.practice.C_sort;
import com.beyond.streamapi.practice.D_mapping;
import com.beyond.streamapi.practice.E_match;
import com.beyond.streamapi.practice.F_aggregate;
import com.beyond.streamapi.practice.G_collect;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.streamapi
 * <p>fileName       : Application
 * <p>author         : hjsong
 * <p>date           : 2025-01-17
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-17        hjsong             최초 생성
 */
public class Application {
    public static void main(String[] args) {
        // 스트림 생성 테스트
        A_create a_create = new A_create();
        // a_create.method1();
        // a_create.method2();
        // a_create.method3();

        // 중간 처리 메소드(필터링) 테스트
        B_filtering b_filtering = new B_filtering();
        // b_filtering.method1();
        // b_filtering.method2();

        // 중간 처리 메소드(정렬) 테스트
        C_sort c_sort = new C_sort();
        // c_sort.method1();
        // c_sort.method2();

        // 중간 처리 메소드(매핑) 테스트
        D_mapping d_mapping = new D_mapping();
        // d_mapping.method1();
        // d_mapping.method2();

        // 최종 처리 메소드(매칭) 테스트
        E_match e_match = new E_match();
        // e_match.method1();
        // e_match.method2();

        // 최종 처리 메소드(집계) 테스트
        F_aggregate f_aggregate = new F_aggregate();
        // f_aggregate.method1();

        // 최종 처리 메소드(수집) 테스트
        G_collect g_collect = new G_collect();
        g_collect.method1();
    }

}
