package com.example.listycity;

/**
 * this class represents a city
 */

public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        //City city = ( City) o;
        return this.city.compareTo(o.getCityName());
    }
}