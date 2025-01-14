package com.beyond.generics;

import com.beyond.generics.practice.ArrayToListConverter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String[] names = {"홍길동", "성춘향", "이몽룡", "김철수", "김영희"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        Double[] dNumbers = {1.1, 2.2, 3.3, 4.4, 5.5};

        // ArrayToListConverter converter = new ArrayToListConverter(names);
        // ArrayToListConverter converter = new ArrayToListConverter(numbers);

        // ArrayToListConverter<String> converter = new ArrayToListConverter(names);
        // ArrayToListConverter<Integer> converter = new ArrayToListConverter(numbers);
        ArrayToListConverter<Double> converter = new ArrayToListConverter(dNumbers);

        converter.print();
        System.out.println();

        List<Double> list = converter.toList();

        Double dNumber = list.get(0);

        System.out.println(dNumber);
        System.out.println(converter.toList());
        System.out.println();
    }
}
