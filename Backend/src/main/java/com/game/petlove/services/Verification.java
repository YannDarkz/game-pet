package com.game.petlove.services;

import com.game.petlove.model.ClienteModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class Verification {
    public boolean checkForEmptyFields(ClienteModel cliente){
        if(cliente.getName().isEmpty()  && cliente.getEmail().isEmpty() && cliente.getAge() != 0){
            return true;
        } else {
            return false;
        }
    }
}
