package com.beyond.thread.practice;

public class LoopThread extends Thread{
    @Override
    public void run() {
        // 작업하고자 하는 코드를 작성한다.
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%s[%d] : %d\n", Thread.currentThread().getName(),
                    i, Thread.currentThread().getPriority());

        } // for i END

    } // run() END

}
