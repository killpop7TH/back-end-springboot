package com.castores.pruebatec.service;

import java.util.List;

import com.castores.pruebatec.model.Taza;
import com.castores.pruebatec.repo.TazaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TazaService {
    private final TazaRepo tazaR;

    @Autowired
    public TazaService(TazaRepo tazaR) {
        this.tazaR = tazaR;
    }

    public Taza addTaza(Taza taza){
        return tazaR.save(taza);
    }

    public List<Taza> findAllTazas(){
        return tazaR.findAll();
    }

    public Taza updateTaza(Taza taza){
        return tazaR.save(taza);
    }
    
    public void deleteTaza(long id){
        tazaR.deleteById(id);
    }

    public Taza findTazaById(Long id) {
        return tazaR.findTazaById(id);
    }

    

}
