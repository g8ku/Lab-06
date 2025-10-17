package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * this class holds the city type objects in a list
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * this method add a city object to the cities list
     * @param city
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }
    public List <City> getCities(){
        List<City>list=cities;
         Collections.sort(list);
         return list;
    }
}
