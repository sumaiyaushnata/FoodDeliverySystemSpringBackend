package com.example.BackendFDS.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Getter
@Setter
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String restaurant_code;
    private String restaurant_name;

    private String restaurant_address;

    private String restaurant_image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRestaurant_code() {
        return restaurant_code;
    }

    public void setRestaurant_code(String restaurant_code) {
        this.restaurant_code = restaurant_code;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getRestaurant_address() {
        return restaurant_address;
    }

    public void setRestaurant_address(String restaurant_address) {
        this.restaurant_address = restaurant_address;
    }

    public String getRestaurant_image() {
        return restaurant_image;
    }

    public void setRestaurant_image(String restaurant_image) {
        this.restaurant_image = restaurant_image;
    }
}
