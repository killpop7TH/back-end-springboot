package com.castores.pruebatec.repo;

import com.castores.pruebatec.model.Taza;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TazaRepo extends JpaRepository<Taza,Long> {

    void deleteTazaById(long id);

    Taza findTazaById(Long id);
    
}
