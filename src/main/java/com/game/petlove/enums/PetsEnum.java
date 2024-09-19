package com.game.petlove.enums;

public enum PetsEnum {
    animalCachorro("Cachorro"),
    animalGato("Gato");

    private String nome;

    PetsEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}
