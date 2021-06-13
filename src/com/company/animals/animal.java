package com.company.animals;

public class Animal implements Feedable {
    final static Double DEFAULT_DOG_WEIGHT = 7.0;
    public String name;
    final static Double DEFAULT_CAT_WEIGHT = 3.0;
    final static Double DEFAULT_ELEPHANT_WEIGHT = 5000.0;
    final static Double DEFAULT_WEIGHT = 1.0;
    public final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "elephant":
                this.weight = DEFAULT_ELEPHANT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
        }

    }

    void printWeight() {
        System.out.println(weight);
    }

    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("Feeding activity registered");
        System.out.println("Animal weight is now " + weight);
    }

    String returnSpeciesAndName() {
        return species + " " + name;
    }

    String returnNameAndOwner(String owner) {
        return name + " " + owner;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(double foodWeight) {

    }
}