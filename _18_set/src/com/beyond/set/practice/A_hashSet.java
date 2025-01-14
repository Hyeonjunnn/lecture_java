package com.beyond.set.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A_hashSet {

    public void method1(){
        Set<String> set = new HashSet<>();

        set.add(null);
        set.add("반갑습니다.");
        set.add(new String("반갑습니다."));
        set.add("여러분");
        set.add("안녕하세요.");
        set.add("여러분");
        set.add(null);
        
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println();
        
        // Set에 저장된 객체에 접근하는 방법
        // 1. 향상된 for 문을 사용하는 방법
        for (String str : set){
            System.out.println(str);

        } // for Set<String> END
        System.out.println();

        // 람다식, 메소드 참조 활용
        // set.forEach(s -> System.out.println(s));
        // set.forEach(System.out::println);

        // 2. HashSet에 저장된 객체들을 ArrayList에 담아서 사용하는 방법
        List<String> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        } // for i END
        System.out.println();

        // 3. Iterator 반복자를 사용하는 방법
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        // 람다식, 메소드 참조 활용
        // iterator.forEachRemaining(s -> System.out.println(s));
        // iterator.forEachRemaining(System.out::println);
    }

    public void method2(){
        Set<Music> musics = new HashSet<>();

        musics.add(new Music("Whiplash", "aespa", 1));
        musics.add(new Music("Whiplash", "aespa", 1));
        musics.add(new Music("Hug", "RIIZE", 3));
        musics.add(new Music("HOME SWEET HOME", "G-DRAGON", 6));
        musics.add(new Music("HOME SWEET HOME", "G-DRAGON", 6));
        musics.add(new Music("APT", "로제", 5));
        musics.add(new Music("Who", "지민", 4));
        musics.add(new Music("HAPPY", "데이식스", 2));
        musics.add(new Music("HAPPY", "데이식스", 2));

        for (Music music : musics) {
            System.out.println(music);
        } // for music END
        System.out.println();
    }
    
}
