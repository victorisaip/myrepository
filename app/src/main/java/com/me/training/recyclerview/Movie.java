package com.me.training.recyclerview;

/**
 * Created by victo on 29/11/2016.
 */

public class Movie {
    //Attributes
    private String title;
    private String genre;
    private String year;
    private String image;

    public Movie(){

    }

    public Movie(String title,String genre,String year,String image){
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
