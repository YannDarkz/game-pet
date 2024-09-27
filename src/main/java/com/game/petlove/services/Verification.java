package com.game.petlove.model.service;

import com.game.petlove.model.ClienteModel;

public class Verification {
    public boolean checkForEmptyFields(ClienteModel cliente){
        if(cliente.getName().isEmpty()  && cliente.getEmail().isEmpty() && cliente.getAge() != 0){
            System.out.println("Estou com todos dados");
            return true;
        } else {
            System.out.println("Está faltando dados");
            return false;
        }
    }

    public static void main(String[] args) {
        ClienteModel cliente = new ClienteModel();
        cliente.setName("Jose");
        cliente.setEmail("sync@gmail.com");
        cliente.setAge(1);

        Verification verification = new Verification();
        System.out.println(verification.checkForEmptyFields(cliente));
    }
}
