package com.beyond.assistStream;

import com.beyond.assistStream.practice.A_byteToCharStream;
import com.beyond.assistStream.practice.B_bufferedStream;
import com.beyond.assistStream.practice.C_dataStream;
import com.beyond.assistStream.practice.D_objectStream;

public class Application {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        // 문자 변환 보조 스트림
        A_byteToCharStream a_byteToCharStream = new A_byteToCharStream();
        // a_byteToCharStream.method1();
        // a_byteToCharStream.method2();

        // 성능 향상 보조 스트림
        B_bufferedStream b_bufferedStream = new B_bufferedStream();
        // b_bufferedStream.fileSave();
        // b_bufferedStream.fileRead();

        // 기본 타입 입출력 보조 스트림
        C_dataStream c_dataStream = new C_dataStream();
        // c_dataStream.fileSaveAndRead();

        // 객체 입출력 보조 스트림
        D_objectStream d_objectStream = new D_objectStream();
        // d_objectStream.fileSave();
        // d_objectStream.fileRead();
        d_objectStream.objectsSave();
        d_objectStream.objectsRead();

        System.out.println("프로그램 종료");
        
    }
}
