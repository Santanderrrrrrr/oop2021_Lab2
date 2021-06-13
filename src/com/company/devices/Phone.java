package com.company.devices;

import com.company.animals.Human;

public class Phone extends Device {
    public final Double screenSize;
    public String os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, String os) {
        this.screenSize = screenSize;
        this.os = os;
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if(seller.phone == this){
            if(buyer.cash >=price){
                seller.cash += price;
                buyer.cash -= price;
                buyer.phone = this;
                seller.phone = null;

                System.out.println("Item has been sold!");
                return true;
            }
        }
        System.out.println("Buyer doesn't have enough money");
        return false;
    }
}