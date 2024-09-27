package com.game.petlove.controller;

import com.game.petlove.model.ClienteModel;
import com.game.petlove.services.Verification;
import com.game.petlove.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class ClienteController {
    @Autowired
    private Verification verification;
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> registerUser(@RequestBody ClienteModel clienteModel){
          boolean state = verification.checkForEmptyFields(clienteModel);
          if(state){
             clienteRepository.save(clienteModel);
             return new ResponseEntity<>(HttpStatus.CREATED);
         } else {
             return new ResponseEntity<>(HttpStatus.ACCEPTED);
         }
    }
}
