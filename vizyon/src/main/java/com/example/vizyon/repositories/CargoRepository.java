package com.example.vizyon.repositories;

import com.example.vizyon.models.Cargo;
import com.example.vizyon.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
}
