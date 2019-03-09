package com.example.poihaly.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotTour {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String photo;
    private String country;
    private String hotel;
    private String date;
    private String food;
    private int price;

    public HotTour() {
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public HotTour(String photo, String country, String hotel, String date, String food, int price) {
        this.photo = photo;
        this.country = country;
        this.hotel = hotel;
        this.date = date;
        this.food = food;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
