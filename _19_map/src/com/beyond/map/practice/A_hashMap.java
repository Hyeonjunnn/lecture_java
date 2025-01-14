package com.beyond.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A_hashMap {

    public void method1(){
        Map<String, Snack> map = new HashMap<>();

        map.put("다이제", new Snack("다이제", "초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸", "바나나맛", 200));
        map.put("프링글스", new Snack("프링글스", "어니언맛", 500));
        map.put("프링글스", new Snack("프링글스", "짠맛", 400));
        map.put("먹태깡", new Snack("먹태깡", "청양마요", 400));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();

        // Key에 해당하는 Value를 얻어오는 메소드
        Snack snack = map.get("칸쵸");
        System.out.println(snack);
        System.out.println();

        snack = map.remove("먹태깡");
        System.out.println(snack);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println();

        // 모든 Entity 객체를 삭제하는 메소드
        map.clear();

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();
    }

    public void method2(){
        Map<String, Snack> map = new HashMap<>();

        map.put("다이제", new Snack("다이제", "초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸", "바나나맛", 200));
        map.put("프링글스", new Snack("프링글스", "어니언맛", 500));
        map.put("초코파이", new Snack("초코파이", "수박맛", 200));
        map.put("먹태깡", new Snack("먹태깡", "청양마요", 400));

        // Map은 인덱스의 개념이 없어서 반복문을 사용할 수 없다.
        // for (int i = 0; i < map.size(); i++) {
        // }

        // Map은 Iterable 인터페이스를 구현하지 않아서 향상된 for 문을 사용할 수 없다.
        // for (Map.Entry<String, Snack> entry : map){
        //
        // }

        // List와 Map은 구조가 달라서 ArrayList에 담아서 사용할 수 없다.
        // new ArrayList<>(map);

        // 1. keySet() 메소드를 사용하는 방법
        //    Map 컬렉션에 있는 키값들만 Set 컬렉션에 담아서 반환한다.
        Set<String> set = map.keySet();

        for (String key : set){
            System.out.printf("Key : %s, value : %s\n", key, map.get(key));
        } // for key END
        System.out.println();


        // 2. entrySet() 메소드를 사용하는 방법
        Set<Map.Entry<String, Snack>> entrySet = map.entrySet();

        for (Map.Entry<String, Snack> entry : entrySet){
            System.out.printf("key : %s, value : %s\n", entry.getKey(), entry.getValue());
        } // for entry END
        System.out.println();

    }

}
