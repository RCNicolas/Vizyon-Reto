package com.example.vizyon.repositories;

import com.example.vizyon.models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository  extends JpaRepository<Pais, Integer> {
}
