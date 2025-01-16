package com.beyond.threadControl;

import com.beyond.threadControl.practice.Consumer;
import com.beyond.threadControl.practice.Producer;
import com.beyond.threadControl.practice.Storage;

public class Application {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer producer = new Producer(storage);
        Thread consumer = new Thread(new Consumer(storage));

        producer.start();
        consumer.start();
    }

}
