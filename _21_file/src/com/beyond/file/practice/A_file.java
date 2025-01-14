package com.beyond.file.practice;

import java.io.File;
import java.io.IOException;

public class A_file {
    /*
    * File 클래스
    * - 파일 크기, 속성, 이름 등의 정보를 얻어내는 기능과 파일 생성 삭제 기능을 제공한다.
    * - 파일의 데이터를 읽고 쓰는 기능은 지원하지 않는다.
    * - 파일의 데이터를 읽고 쓰기 위해서는 파일 관련 입출력 스트림을 사용해야 한다.
    */
    public void method1() {
        try {

            // File file = new File("test.txt"); // 메모리상에만 존재하는 객체
            File file = new File("C:\\Users\\Playdata\\lecture_java\\test.txt"); // 메모리상에만 존재하는 객체

            System.out.println("파일명 : " + file.getName());
            System.out.println("파일 경로 : " + file.getAbsoluteFile());
            System.out.println("파일 욜량 : " + file.length());
            System.out.println("파일 존재 여부 : " + file.exists());
            System.out.println("파일 여부 : " + file.isFile());
            System.out.println("디렉토리 여부 : " + file.isDirectory());
            System.out.println();

            if (file.exists()){
                file.delete(); // 파일 또는 디렉터리를 삭제한다.
            } else{
                file.createNewFile(); // 실제 파일이 만들어진다.
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public void method2(){
        try{
            boolean result;

            // File demo = new File("C:/Users/Playdata/lecture_java/temp");
            File demo = new File("C:/Users/Playdata/lecture_java/temp/demo");
            File file = new File("C:/Users/Playdata/lecture_java/temp/demo/demo.txt");

            if (!demo.exists()){
                // 디렉터리 생성
                // file.mkdir();
                demo.mkdirs();
            }

            /*
            * 파일 생성
            * - 경로를 지정하면 해당 위치에 파일을 생성한다.
            * - 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다.
            */
            result = file.createNewFile();

            System.out.printf("폴더 및 파일 생성 여부 : %b\n", result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
