package com.example.BackendFDS.Service;


import com.example.BackendFDS.Entity.Restaurant;
import com.example.BackendFDS.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;


    //getdata
    public List<Restaurant> getAllData() {


        return restaurantRepository.findAll();
    }


    public Restaurant post(Restaurant restaurantEntity) {
        restaurantRepository.save(restaurantEntity);


        return null;
    }
}
