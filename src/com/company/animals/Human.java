package com.company.animals;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public static Phone phone;
    public static Car car;
    public double cash;

    public final static String HUMAN_SPECIE = "homo sapiens";

    private Double salary;

    public Human(Double salary) {
        super(HUMAN_SPECIE);
        this.setSalary(salary);
    }

    public Double getSalary() {
        
        return this.salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Salary not entered");
            this.salary = 0.0;
        }
    }

}