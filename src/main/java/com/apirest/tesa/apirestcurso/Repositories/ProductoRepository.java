package com.apirest.tesa.apirestcurso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.tesa.apirestcurso.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
