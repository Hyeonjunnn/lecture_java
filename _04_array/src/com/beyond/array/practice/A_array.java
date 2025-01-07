package com.beyond.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class A_array {

    // 배열의 선언 및 생성, 초기화 (new 연산자 사용)
    public void method1(){
        // 1) 배열의 선언 및 생성
        int[] iArray1 = new int[5];
        int iArray2[];
        
        iArray2 = new int[10];

        // 2) 배열 변수와 인덱스를 이용한 초기화
        iArray1[0] = 2;
        iArray1[1] = 4;
        iArray1[2] = 6;
        iArray1[3] = 8;
        iArray1[4] = 10;
        // iArray1[5] = 12; // ArrayIndexOutOfBoundsException

        // 3) 배열 변수와 인덱스를 이용한 출력
        System.out.println(iArray1[0]);
        System.out.println(iArray1[1]);
        System.out.println(iArray1[2]);
        System.out.println(iArray1[3]);
        System.out.println(iArray1[4]);
        // System.out.println(iArray1[5]); // ArrayIndexOutOfBoundsException
        System.out.println();
        
        // 4) 반복문을 이용한 출력
        // 배열변수.length를 통해서 배열의 길이를 알 수 있다.
        // for (int i = 0; i < iArray1.length; i++){
        //     System.out.println(iArray1[i]);
        // }

        for (int value : iArray1){
            System.out.println(value);
        }
        System.out.println();

        // Arrays 클래스의 toString() 메소드를 이용한 출력
        System.out.println(Arrays.toString(iArray1));

        // 배열을 생성하고 초기화하지 않는다면, JVM이 지정한 기본값으로 배열이 초기화된다.
        // (정수형 : 0, 실수형 : 0.0, 문자형 : \u0000, 논리값 : false, 참조형 : null, )
        System.out.println(Arrays.toString(iArray2));
    }

    // 배열의 선언 및 생성, 초기화 (값의 목록 사용)
    public void method2() {
        int[] iArray = new int[]{1, 2, 3, 4, 5};
        double[] dArray = {1.1, 2.2, 3.3};

        System.out.println(iArray.length);
        System.out.println(Arrays.toString(iArray));
        System.out.println();

        System.out.println(dArray.length);
        System.out.println(Arrays.toString(dArray));
        System.out.println();

        // dArray = {5.5, 6.6, 7.7, 8.8};
        dArray = new double[]{5.5, 6.6, 7.7, 8.8};

        System.out.println(dArray.length);
        System.out.println(Arrays.toString(dArray));
        System.out.println();
    }
    
    // 문자열 배열
    // 사용자로부터 과일 이름을 입력받아서 배열에 저장
    public void method3(){
        String[] fruits = new String[3];
        Scanner scanner = new Scanner(System.in);

        // System.out.println(Arrays.toString(fruits));

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("과일 입력 > ");
            fruits[i] = scanner.next();
        }

        System.out.println(Arrays.toString(fruits));
    }

    // 배열의 정렬
    public void method4(){
        int[] iArray = {2, 7, 5, 1, 3};
        String[] sArray = {"메론", "orange", "Apple", "banana", "apple", "레몬", "apeach"};

        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(sArray));
        System.out.println();

        // 오름차순 정렬
        Arrays.sort(iArray);
        Arrays.sort(sArray);

        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(sArray));
        System.out.println();
        
        // 내림차순 정렬
        // 원본 배열을 오름차순으로 정렬한 다음 값을 반대로 새로운 배열에 대입한다.
        int[] copy = new int[iArray.length];

        for (int i = 0; i < iArray.length; i++){
            copy[4 - i] = iArray[i];
        }

        System.out.println(Arrays.toString(copy));
        System.out.println();
    }

    /*
     * 실습 문제 1
     * 사용자가 입력하는 정수값으로 배열의 길이를 지정하여 배열을 생성하고
     * 생성된 배열의 크기만큼 반복문을 실행하여 랜덤값을(1 ~ 100) 배열의 저장하고 출력한다.
     *
     * 예시)
     * 정수값을 입력해 주세요. > 3
     *
     * numbers[0] : 77
     * numbers[1] : 88
     * numbers[2] : 6
     */
    public void practice1() {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수값을 입력해 주세요. > ");
        num = scanner.nextInt();

        int[] numbers = new int[num];

        for (int i = 0; i < num; i++){
            numbers[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = 0; i < num; i++){
            System.out.printf("numbers[%d] : %d\n", i, numbers[i]);
        }
    }

    /*
     * 실습 문제 2
     *
     * 사용자에게 3명의 키를 입력받아 배열에 저장하고
     * 반복문을 통해 3명의 키의 총합, 평균값을 구하시오.
     *
     * 예시)
     * 키 입력 > 180.0
     * 키 입력 > 177.3
     * 키 입력 > 168.2
     *
     * 총합 : 525.5
     * 평균 : 175.2
     */
    public void practice2() {
        double sum = 0;
        double avg = 0;
        double[] height_arr = new double[3];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++){
            System.out.print("키 입력 > ");
            height_arr[i] = scanner.nextDouble();
            sum += height_arr[i];
        }
        avg = sum / 3;

        System.out.println();
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
