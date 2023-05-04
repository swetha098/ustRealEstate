package com.UST.ustRealEstate.Controller;

import com.UST.ustRealEstate.Entity.RealEstate;
import com.UST.ustRealEstate.Service.RealService.RealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
@RestController
@RequestMapping("/realestate")

public class RealController {
    @Autowired
    private RealService realservice;
    @GetMapping("/getall")

    public List<RealEstate>getAll(){
        return realservice.findAll();
    }

    @GetMapping("/zipcode{zip_code}")
    public List<RealEstate> getzip(@PathVariable Integer zip_code ){
        return realservice.getByZipcode(zip_code);
    }
    @GetMapping("/state{state}")
    public List<RealEstate> getstate(@PathVariable String state){
        return realservice.getByState(state);
    }
    @GetMapping("/city{city}")
    public List<RealEstate> getcity(@PathVariable String city){
        return realservice.getByCity(city);
    }
    @GetMapping("/price{price}")
    public List<RealEstate> getprice(@PathVariable double price){
        return realservice.getByPrice(price);
    }
    @GetMapping("/2-bathroom{bath}")
    public List<RealEstate> getbathroom(@PathVariable BigInteger bath){
        return realservice.getByTwoBathroom(bath);
    }
    @GetMapping("/2-bedroom{bed}")
    public List<RealEstate> getbedroom(@PathVariable Integer bed) {
        return realservice.getByTwoBedroom(bed);
    }
    @GetMapping("/selectstatus/{city}")
    public ResponseEntity<Integer> getCountOfForSalePropertiesInCity(@PathVariable String city) {
        int count = realservice.getCountOfForSalePropertiesInCity(city);
        return ResponseEntity.ok(count);
    }
}