package com.example.prueba_abitacolo.repositories;

import com.example.prueba_abitacolo.entities.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbitacoloRepositories extends JpaRepository<Furniture, Long> {
}
