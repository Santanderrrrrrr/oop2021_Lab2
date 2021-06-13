package com.company;

import com.company.animals.Animal;
import com.company.animals.Human;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.name = "Pako";
        Phone EssTen = new Phone("EssTen",
                "Twelve",
                10.2,
                "Android");

        Human me = new Human(1000.0);
        me.firstName = "Leon";
        me.lastName = "Omollo";
        me.pet = dog;
        me.cash = 3000;
        me.phone = EssTen;

        Human buyer = new Human(2000.0);
        buyer.firstName = "Portgas";
        buyer.lastName = "Ace";
        buyer.cash = 30000;

        me.phone.sell(me,buyer,150.0);

        System.out.println(me.cash);
        System.out.println(buyer.cash);







    }
}