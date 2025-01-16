package com.beyond.threadControl.practice;

public class Consumer implements Runnable{
    private final Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                storage.getProduct();

                // 스레드를 매개값으로 지정된 시간만큼 일시 정지시키는 메소드
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // try-catch END

        } // for i END

    } // run() END

}
