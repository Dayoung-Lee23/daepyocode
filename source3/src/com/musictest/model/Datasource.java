package com.musictest.model;

import java.sql.*;
import java.util.ArrayList;

public class Datasource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\402-016\\database\\source1\\"+DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    private Connection conn;

    public boolean open(){ //메서드의 결과값 자체가 참 거짓으로 분리가 되므로 자료형을 boolean으로 설정
        try{
            conn = DriverManager.getConnection(CONNECTION_STRING);
            System.out.println("It was connected");
            return true;
        }catch(SQLException e){
            System.out.println("Couldn't connect to database: "+e.getMessage());
            return false;
        }
    }//분기를 더 세분하게 나눠주는 거임.
    public void close(){
        try{
            if(conn != null){//null 값이 아니면 = 현재 연결 상태면
                conn.close();//연결을 끊어줘
                System.out.println("connection closed");
            }
        }catch(SQLException e){//null값이면
            System.out.println("Couldn't close connection: "+e.getMessage());
        }
    }

    public ArrayList<Artist> queryArtists(){ //이 ArrayList형의 result를 내놓는 메서드 이름은 queryArtists()
        try (Statement statement = conn.createStatement();//Exception을 필요로 하는 메서드
             //results에 Artists의 id와 name이 들어감
             ResultSet results = statement.executeQuery("SELECT * FROM "+ TABLE_ARTISTS)) {
            //results안에 모든 테이블을 다 집어넣었는데 이것 이름과 id로 갈라야하니 밑에서.
                ArrayList<Artist> artists = new ArrayList<>(); //순서가 있는 ArrayList 생성
                while(results.next()){ //results에 next가 있으면 돌려라
                    Artist artist = new Artist();//Artist 클래스에서의 getter setter를 사용하기 위해 인스턴스 생성
                    //Artist 클래스의 객체 생성.
                    artist.setId(results.getInt(COLUMN_ARTIST_ID));
                    artist.setName(results.getString(COLUMN_ARTIST_NAME));
                    artists.add(artist);//ArrayList의 인스턴스 artist에다가 계속 위에서 불러온 값을 넣는다.
                }
                return artists; //ArrayList형태의 결과물을 return.
        }catch (SQLException e){
            System.out.println("Query failed: "+e.getMessage());
            return null;
        }
    }
}
