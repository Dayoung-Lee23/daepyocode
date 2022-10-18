package com.musictest.model;

public class Artist {
    private int id; //모든 테이블에서 연관이 있는 요소
    private String name;
//ex 개인정보 부분은 이런식으로 private 제어자 설정
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
