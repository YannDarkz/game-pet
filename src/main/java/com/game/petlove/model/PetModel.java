package com.game.petlove.model;

import com.game.petlove.enums.PetsEnum;

public class PetModel {
    private int id;
    private String name;
    private int age;
    private String pet = null;

    public PetModel(int id, String name, int age, String pet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "PetModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPet() {
        return pet;
    }

    public static void main(String[] args) {
        PetsEnum animal = PetsEnum.animalCachorro;
        PetModel pet = new PetModel(1, "Dudinha", 6, animal.getNome());
        System.out.println(pet);
    }
}
