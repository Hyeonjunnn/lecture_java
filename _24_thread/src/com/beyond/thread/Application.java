package com.beyond.thread;

import com.beyond.thread.practice.LoopRunnable;
import com.beyond.thread.practice.LoopThread;

public class Application {
    public static void main(String[] args) {
        System.out.println("메인 스레드 실행");
        System.out.printf("%s : %d", Thread.currentThread().getName(), Thread.currentThread().getPriority());

        /*
         * 스레드 생성 방법
         * 1. Thread 클래스를 상속받는 방법
         * 2. Runnable 인터페이스를 구현하는 방법
         * 3. 익명 구현 객체로 Runnable 인터페이스의 구현 객체를 생성하는 방법
         * 4. 람다식으로 Runnable 인터페이스의 구현 객체를 생성하는 방법
         */
        // 스레드 생성 방법
        // 1. Thread 클래스를 상속받는 방법
        LoopThread loopThread = new LoopThread();

        loopThread.setName("Thread-1");
        // loopThread.run();
        loopThread.setPriority(Thread.MAX_PRIORITY);
        loopThread.start();

        // 2. Runnable 인터페이스를 구현하는 방법
        Thread thread = new Thread(new LoopRunnable());

        thread.setName("Thread-2");
        // thread.run();
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

        // 3. 익명 구현 객체로 Runnable 인터페이스의 구현 객체를 생성하는 방법
        Thread anonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 작업하고자 하는 코드를 작성한다.
                for (int i = 1; i <= 100; i++) {
                    System.out.printf("%s[%d] : %d\n", Thread.currentThread().getName(),
                            i, Thread.currentThread().getPriority());

                }
            } // run() END
        }); // new Thread(...) END

        anonymousThread.setName("Thread-3");
        anonymousThread.start();

        // 4. 람다식으로 Runnable 인터페이스의 구현 객체를 생성하는 방법
        Thread lambdaThread = new Thread(() -> {
            // 작업하고자 하는 코드를 작성한다.
            for (int i = 1; i <= 100; i++) {
                System.out.printf("%s[%d] : %d\n", Thread.currentThread().getName(),
                        i, Thread.currentThread().getPriority());

            }
        });

        /*
         * 데몬 스레드
         * - 보조적인 역할을 수행하는 스레드이다.
         * - 모든 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
         */
        lambdaThread.setName("DaemonThread");
        lambdaThread.setDaemon(true);
        lambdaThread.start();

        try {
            /*
            * join() 메소드
            * - join()을 활용한 스레드는 해당 스레드가 종료될 때까지 기다렸다가
            *   스레드가 종료되면 join() 호출한 스레드를 다시 실행한다.
            */
            loopThread.join();
            thread.join();
            anonymousThread.join();
            // lambdaThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();

        } // try-catch END

        System.out.println("메인 스레드 종료");
    }
}
