package com.game.petlove.model;

import com.game.petlove.enums.PetsEnum;

public class PetModel {
    private int id;
    private String name;
    private int age;
    private String pet ;
    private boolean petStatus;

    public PetModel(int id, String name, int age, String pet, boolean petStatus) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.petStatus = petStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public boolean isPetStatus() {
        return petStatus;
    }

    public void setPetStatus(boolean petStatus) {
        this.petStatus = petStatus;
    }

    public static void main(String[] args) {
        PetsEnum animal = PetsEnum.animalCachorro;
        PetModel pet = new PetModel(1, "Dudinha", 6, animal.getNome(), false);
        System.out.println(pet);
    }
}
