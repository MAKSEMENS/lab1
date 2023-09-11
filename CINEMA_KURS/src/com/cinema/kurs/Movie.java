package com.cinema.kurs;

public class Movie {
    private String title;
    private String genre;
    private int year;
    private String director;
    public String GetGenre(){
        return genre;
    }
    public void SetGenre(String newGenre){
        genre = newGenre;
    }
    public String GetDirector(){
        return director;
    }
    public void SetDirector(String newDirector){
        director = newDirector;
    }
    public String GetTitle(){
        return title;
    }
    public void SetTitle(String newTitle){
        title = newTitle;
    }
    public int GetYear(){
        return year;
    }
    public void SetYear(int newYear){
        year = newYear;
    }

}
