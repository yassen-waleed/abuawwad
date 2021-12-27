package com.example.myapplication;

public class House {
    private int id ;
    private String city ;
    private double surface ;
    private int numOfbedrooms ;
    private double price ;
    private String status ;
    private boolean hasbalcone ;
    private boolean hasgarden ;
    private int imageId ;

    public House(int id, String city, double surface, int numOfbedrooms, double price, String status, boolean hasbalcone, boolean hasgarden, int imageId) {
        this.id = id;
        this.city = city;
        this.surface = surface;
        this.numOfbedrooms = numOfbedrooms;
        this.price = price;
        this.status = status;
        this.hasbalcone = hasbalcone;
        this.hasgarden = hasgarden;
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getNumOfbedrooms() {
        return numOfbedrooms;
    }

    public void setNumOfbedrooms(int numOfbedrooms) {
        this.numOfbedrooms = numOfbedrooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isHasbalcone() {
        return hasbalcone;
    }

    public void setHasbalcone(boolean hasbalcone) {
        this.hasbalcone = hasbalcone;
    }

    public boolean isHasgarden() {
        return hasgarden;
    }

    public void setHasgarden(boolean hasgarden) {
        this.hasgarden = hasgarden;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
