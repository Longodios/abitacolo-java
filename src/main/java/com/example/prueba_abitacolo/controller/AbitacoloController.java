package com.example.prueba_abitacolo.controller;

import com.example.prueba_abitacolo.entities.Furniture;
import com.example.prueba_abitacolo.repositories.AbitacoloRepositories;
import com.example.prueba_abitacolo.services.AbitacoloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/furniture")
public class AbitacoloController {

    private final AbitacoloService abitacoloService;

    public AbitacoloController(AbitacoloService abitacoloService) {
        this.abitacoloService = abitacoloService;
    }


    @PostMapping
    public ResponseEntity<Furniture> saveFurniture(@RequestBody Furniture furniture){
         Furniture createdFurniture = this.abitacoloService.saveFurniture(furniture);
         return ResponseEntity.ok(createdFurniture);
    }
}
