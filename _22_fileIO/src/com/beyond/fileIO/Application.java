package com.beyond.fileIO;

import com.beyond.fileIO.practice.A_fileByteStream;
import com.beyond.fileIO.practice.B_fileCharStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("프로그램 실행");

        A_fileByteStream a_fileByteStream = new A_fileByteStream();
        // a_fileByteStream.fileSave();
        // a_fileByteStream.fileRead();

        B_fileCharStream b_fileCharStream = new B_fileCharStream();
        // b_fileCharStream.fileSave();
        b_fileCharStream.fileRead();

        System.out.println("프로그램 종료");
    }
}
