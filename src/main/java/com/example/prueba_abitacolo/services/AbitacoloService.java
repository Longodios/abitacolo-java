package com.example.prueba_abitacolo.services;

import com.example.prueba_abitacolo.entities.Furniture;
import com.example.prueba_abitacolo.repositories.AbitacoloRepositories;
import org.springframework.stereotype.Service;

@Service
public class AbitacoloService  {

    private final AbitacoloRepositories abitacoloRepositories;

    public AbitacoloService(AbitacoloRepositories abitacoloRepositories) {
        this.abitacoloRepositories = abitacoloRepositories;
    }

    public Furniture saveFurniture(Furniture furnitureRequest){
        Furniture furnitureCreatedInDatabase = this.abitacoloRepositories.save(furnitureRequest);
        return furnitureCreatedInDatabase;
    }


}
