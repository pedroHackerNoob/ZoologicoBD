package com.itson.model;

public class Animal{
    private String animalName;
    private int age;

    private Tamanio Tamanio;
    private Habitat Habitat;

    private final String genderMale = "male";
    private final String genderFemale = "female";

    public Animal(String animalName, int age, com.itson.model.Tamanio tamanio, com.itson.model.Habitat habitat) {
        this.animalName = animalName;
        this.age = age;
        Tamanio = tamanio;
        Habitat = habitat;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAge() {
        return age;
    }

    public Tamanio getTamanio() {
        return Tamanio;
    }

    public Habitat getHabitat() {
        return Habitat;
    }

    public String getGenderMale() {
        return genderMale;
    }

    public String getGenderFemale() {
        return genderFemale;
    }
}
