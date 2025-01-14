package com.beyond.set.practice;

import java.util.Objects;

public class Music implements Comparable<Music>{
    private String title;
    private String artist;
    private int ranking;

    public Music(String title, String artist, int ranking) {
        this.title = title;
        this.artist = artist;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ranking=" + ranking +
                '}';
    }

    /*
    * compareTo()
    * - 메소드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
    * - 비교해서 같으면 0을 리턴한다.
    * - 비교해서 자신이 크다면 양의 정수를 리턴한다.
    * - 비교해서 자신이 작다면 음의 정수를 리턴한다.
    */
    @Override
    public int compareTo(Music music) {

        return this.ranking - music.ranking; // 오름차순으로 정렬
        // return music.ranking - this.ranking; // 내림차순으로 정렬
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return ranking == music.ranking && Objects.equals(title, music.title) && Objects.equals(artist, music.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, ranking);
    }
}
