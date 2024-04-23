package com.example.vizyon.repositories;

import com.example.vizyon.models.insumoproveedor.InsumoProveedor;
import com.example.vizyon.models.insumoproveedor.InsumoProveedorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumoProveedorRepository extends JpaRepository <InsumoProveedor, InsumoProveedorId> {
}
