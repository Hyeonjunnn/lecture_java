package com.beyond.enumeration.practice;

public enum Week {
    MONDAY("월요일", "월", 1),
    TUESDAY("화요일", "화", 2),
    WEDNESDAY("수요일", "수", 3),
    THURSDAY("목요일", "목", 4),
    FRIDAY("금요일", "금", 5),
    SATURDAY("토요일", "토", 6),
    SUNDAY("일요일", "일", 7);

    private final String name;
    private final String shortName;
    private final int value;

    Week(String name, String shortName, int value) {
        this.name = name;
        this.shortName = shortName;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public int getValue() {
        return value;
    }
}
