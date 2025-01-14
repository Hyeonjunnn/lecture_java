package com.beyond.generics.practice;

import java.util.ArrayList;
import java.util.List;

/*
* 타입 파라미터는 대문자 알파벳 한 글자로 표현한다.
* E - Element
* K = Key
* V - Value
* T - Type
* N - Number
* R - Result
* */
// public class ArrayToListConverter<T> {
public class ArrayToListConverter<T extends Number> {
    private final T[] values;

    public ArrayToListConverter(T[] values) {
        this.values = values;
    }

    public void print() {
        for (T value : values){
            System.out.println(value);
        }

        // Arrays.stream(values).forEach(System.out::println);
    }

    public List<T> toList() {
        List<T> list = new ArrayList<>();

        for (T value : values){
            list.add(value);
        }
        // Arrays.stream(values).toList();

        return list;
    } // toList() END
}
