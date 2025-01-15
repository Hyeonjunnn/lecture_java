package com.beyond.assistStream.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_dataStream {
    public void fileSaveAndRead(){
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("b_data.txt"));
             DataInputStream dis = new DataInputStream(new FileInputStream("b_data.txt"))) {

            // 파일에서 데이터를 출력하기
            dos.writeUTF("홍길동");
            dos.writeInt(30);
            dos.writeDouble(175.3);
            dos.writeChar('남');
            dos.writeBoolean(false);

            // 파일에서 데이터를 읽어오기
            // System.out.println(dis.readUTF());
            // System.out.println(dis.readInt());
            // System.out.println(dis.readDouble());
            // System.out.println(dis.readChar());
            // System.out.println(dis.readBoolean());

            // 파일에서 데이터를 읽어오기
            System.out.printf("이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c, 결혼 여부는 %b입니다.\n",
                    dis.readUTF(), dis.readInt(), dis.readDouble(), dis.readChar(), dis.readBoolean());
            // System.out.println(dis.readUTF()); // 에러 => EOFException(End Of File Exception)

        } catch (IOException e) {
            e.printStackTrace();

        } // try-catch END

    } // fileSaveAndRead() END

}
