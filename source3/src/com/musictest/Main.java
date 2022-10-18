package com.musictest;

import com.musictest.model.Artist;
import com.musictest.model.Datasource;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { //실행하고자 하는 기능들의 집합

        Datasource datasource = new Datasource();
        //datasource의 open메서드 사용
        if (!datasource.open()) { //이게 false였을 경우에
            System.out.println("Can't open datasource");
            return;
        }
        ArrayList<Artist> artists = datasource.queryArtists(); //datasource에서 queryArtists()를 실행한 걸 artist에 저장
        //주는 형태가 ArrayList니까 이 형식으로 받아와야 한다. artists에다가 ArrayList를 담음
        if(artists == null){ //artists 안에 아무 내용이 없을 것을 대비한 에러메서지
            System.out.println("Can't find an artist");
            return;
        }
        for (Artist i : artists){ //setName, setID 했던 부분 가져오기
            //artist에 저장된 끝까지 for문을 돌리새요
            System.out.println("ID = "+i.getId()+", Name = "+i.getName());
        }

        datasource.close();
    }
}
