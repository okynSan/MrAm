package ua.am.mr.mram.model;

import ua.am.mr.mram.model.order.Address;

public class Restaurant {

    private String restaurantName;
    private Address restAddress;

    public Restaurant(String restaurantName, Address restAddress) {
        this.restaurantName = restaurantName;
        this.restAddress = restAddress;
    }


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Address getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(Address restAddress) {
        this.restAddress = restAddress;
    }
}
