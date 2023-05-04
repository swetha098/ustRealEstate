package com.UST.ustRealEstate.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="realtor")
public class RealEstate {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String status;

    @Column(nullable = false)
    private Integer bed;

    @Column(nullable = false)
    private BigInteger bath;

    @Column(nullable = false, precision = 12, scale = 2)
    private Double acreLot;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(nullable = false, length = 50)
    private String state;

    @Column(name="zip_code",nullable = false, length = 10)
    private Integer zipcode;

    @Column(nullable = false)
    private BigInteger houseSize;

    @Column
    private String  prevSoldDate;

    @Column(nullable = false, precision = 12, scale = 2)
    private Double price;

}

