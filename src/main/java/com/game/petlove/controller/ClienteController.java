package com.game.petlove.controller;

import com.game.petlove.model.ClienteModel;
import com.game.petlove.model.service.Verification;
import com.game.petlove.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {
    private static Verification verification;

    @Autowired
    private static ClienteRepository clienteRepository;

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> registerUser(@RequestBody ClienteModel clienteModel){
         if(!verification.checkForEmptyFields(clienteModel)){
             return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
         } else if(verification.checkForEmptyFields(clienteModel)){
             clienteRepository.save(clienteModel);
             return new ResponseEntity<>(HttpStatus.CREATED);
         } else {
             return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
         }
    }

}
