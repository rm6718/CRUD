package com.ironyard.data;

/**
 * Created by reeva on 9/22/16.
 */
public class Takeout {

    private String name;
    private String cuisineType;
    private String distance;
    private long id;

    public Takeout(String name, String cuisineType, String distance, long id) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.distance = distance;
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCuisineType() { return cuisineType; }

    public void setCuisineType(String cuisineType) { this.cuisineType = cuisineType; }

    public String getDistance() { return distance; }

    public void setDistance(String distance) { this.distance = distance; }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }



}
