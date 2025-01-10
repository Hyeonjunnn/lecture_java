package com.beyond.abstractClass.practice;

public abstract class Sports {
    // 참여하는 사람의 수
    protected int numberOfPlayers;

    public Sports(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    // 추상 메소드
    public abstract void rule();

}
