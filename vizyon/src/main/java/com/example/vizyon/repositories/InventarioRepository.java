package com.example.vizyon.repositories;

import com.example.vizyon.models.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer>{


//    @Query("SELECT i FROM Inventario_talla i JOIN FETCH i.id_talla_fk JOIN FETCH i.color")
//    List<Inventario> findAllProductosInventarioWithTallaAndColor();


}
