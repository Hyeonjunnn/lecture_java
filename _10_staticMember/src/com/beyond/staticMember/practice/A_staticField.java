package com.beyond.staticMember.practice;

public class A_staticField {

    public static int number = 2;

    private static String message = "Hello World!";

    // 정적 필드에 대한 Getter와 Setter 메소드 또한 static 키워드가 붙어야 한다.
    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        A_staticField.message = message;
    }
}
