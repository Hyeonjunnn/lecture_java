package com.beyond.assistStream.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class D_objectStream {
    public void fileSave(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_object.dat"))) {
            // FileOutputStream fos = new FileOutputStream("c_object.dat");
            // ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(new Member("hong123", "1234", "홍길동", 30, '남', 3456.789));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fileRead(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"))) {

            Member member = (Member) ois.readObject();
            System.out.println(member);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } // try-catch END

    } // fileRead() END

    public void objectsSave(){
        List<Member> members = new ArrayList<>();

        members.add(new Member("hong123","1234","홍길동",30,'남',12.34));
        members.add(new Member("kim123","5678","김철수",25,'남',34.56));
        members.add(new Member("sung123","9012","성춘향",20,'여',56.78));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_objects.dat"))) {

            for (Member member : members){
                oos.writeObject(member);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void objectsRead(){
        try {
            List<Member> members = new ArrayList<>();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(("c_objects.dat")));


            // members.add((Member) ois.readObject());

            for (Member member : members){
                System.out.println(member);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
