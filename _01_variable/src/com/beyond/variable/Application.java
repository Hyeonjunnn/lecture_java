package com.beyond.variable;
import com.beyond.variable.practice.A_variable;
import com.beyond.variable.practice.B_consoleOutput;
import com.beyond.variable.practice.C_keyboardInput;

/*
    주석(Comment)
    - 소스 코드와는 무관하고 코드로 인식되지 않는다.
    - 주로 코드에 대한 설명을 작성할 때 사용된다.
*/

// 한 줄 주석
// 추가로 주석 작성

// 클래스 이름을 자바 파일의 이름과 동일해야 한다.
public class Application {
   // main 메소드는 프로그램의 시작점으로
   // java.exe 가 Applicaition.class를 실행시킬 때 제일 먼저 실행되는 메소드이다.
    public static void main(String[] args) {

        // 1. 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
        // [표현법]
        // 클래스명 변수명 = new 클래스명();

        // 1-1) import 문을 사용하지 않고 클래스 생성
        // com.beyond.variable.practice.A_variable variable = new com.beyond.variable.practice.A_variable();

        // 1-2) import 문을 사용하여 클래스 생성
        A_variable variable = new A_variable();
        B_consoleOutput output = new B_consoleOutput();
        // C_keyboardInput input = new C_keyboardInput();

        // 2. 생성한 클래스로 메소드를 실행(호출)
        // [표현법]
        // 변수명.메소드명();
        // variable.variableTest();
        // variable.autoCasting();
        // variable.casting();
        // variable.practice();
        // output.valuePrint();
        // input.inputByScanner();
        new C_keyboardInput().inputByScanner();
    }
}
