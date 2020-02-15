package com.UserInterface.handling;

public class Movie {

    private long id;
    private String title;
    private int release;

    public Movie(){}


    public Movie(long id, String title, int release){
        this.id = id;
        this.title = title;
        this.release = release;
    }

    public long getId(){
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getRelease(){
        return release;
    }

    public void setRelease(int release){
        this.release = release;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + ',' +
                ", release='" + release  +'}';
    }

}
