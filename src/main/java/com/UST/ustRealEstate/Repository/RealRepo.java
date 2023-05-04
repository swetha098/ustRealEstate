package com.UST.ustRealEstate.Repository;

import com.UST.ustRealEstate.Entity.RealEstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface RealRepo extends JpaRepository<RealEstate,Integer> {

    List<RealEstate> findByZipcode(Integer zipCode);

    List<RealEstate> findByState(String state);

    List<RealEstate> getByCity(String city);

    List<RealEstate> findByPrice(double price);

    List<RealEstate> findByBath(BigInteger bath);

    List<RealEstate> findByBed(Integer bed);

    List<RealEstate> findByCity(String city);


}

