package com.beyond._exception.practice;

import java.util.Scanner;

public class C_runtimeException {
    public void method1(){
        // NegativeArraySizeException, ArrayIndexOutOfBoundsException
        int size = 0;
        int[] numbers = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 길이 > ");
        size = scanner.nextInt();

        if (size <= 0){
            System.out.println("0보다 큰 값을 입력해 주세요");

            return;
        }

        numbers = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print(numbers[i] + " ");
        }

    }

}
