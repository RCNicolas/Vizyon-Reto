package com.example.vizyon.repositories;

import com.example.vizyon.models.Prenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrendaRepository extends JpaRepository<Prenda, Integer> {
}
