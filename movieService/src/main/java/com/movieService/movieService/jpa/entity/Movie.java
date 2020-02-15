package com.movieService.movieService.jpa.entity;
import org.springframework.context.annotation.Profile;

import javax.persistence.*;
@Entity
@Table(name ="c_movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "release")
    private int release;


    public Movie(){}


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

}
