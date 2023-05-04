package com.UST.ustRealEstate.Service.RealService;

import com.UST.ustRealEstate.Entity.RealEstate;
import com.UST.ustRealEstate.Repository.RealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class RealService {
    @Autowired
    private RealRepo realrepo;
    public List<RealEstate> findAll() {
        return realrepo.findAll();
    }


    public List<RealEstate> getByZipcode(Integer zip_code) {
        return realrepo.findByZipcode(zip_code);
    }


    public List<RealEstate> getByState(String state) {
        return  realrepo.findByState(state);
    }


    public List<RealEstate> getByCity(String city) {
        return  realrepo.getByCity(city);

    }

    public List<RealEstate> getByPrice(double price) {
        return  realrepo.findByPrice(price);
    }

    public List<RealEstate> getByTwoBathroom(BigInteger bath) {
        return  realrepo.findByBath(bath);
    }

    public List<RealEstate> getByTwoBedroom(Integer bed) {
        return  realrepo.findByBed(bed);
    }

    public int getCountOfForSalePropertiesInCity(String city) {
        List<RealEstate> propertiesInCity = realrepo.findByCity(city);
        int count = (int) propertiesInCity.stream()
                .filter(p -> p.getStatus().equals("for_sale"))
                .count();
        return count;
    }
}


