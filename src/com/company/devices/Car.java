package com.company.devices;

import com.company.animals.Human;

public abstract class Car extends Device {

    public Double engineSize;
    public String fuelType;

    @Override
    public void turnOn() {
        System.out.println("Car on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if(seller.car == this){
            if(buyer.cash >=price){
                seller.cash += price;
                buyer.cash -=price;
                buyer.car = this;
                seller.car = null;
                System.out.println("Item has been sold!");
                return true;
            }
        }
        System.out.println("Buyer balance insufficient");
        return false;
    }
    public abstract void refuel();

}