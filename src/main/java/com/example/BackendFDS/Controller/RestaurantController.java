package com.example.BackendFDS.Controller;

import com.example.BackendFDS.Entity.FoodEntity;
import com.example.BackendFDS.Entity.Restaurant;
import com.example.BackendFDS.Service.RestaurantService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Data
@CrossOrigin(origins="http://localhost:4200" ,allowCredentials ="true")
@RequestMapping("fds/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/posts")
    public List<Restaurant> getAllData(){

        return restaurantService.getAllData();
    }

    @PostMapping("/posts")
    public Restaurant saveData(@RequestBody Restaurant restaurantEntity) {
        //System.out.print(restaurantEntity.getDiscount()+foodEntity.getFood_code());
        return restaurantService.post(restaurantEntity);
    }
}
