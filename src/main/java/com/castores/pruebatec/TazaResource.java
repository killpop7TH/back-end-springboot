package com.castores.pruebatec;

import java.util.List;

import com.castores.pruebatec.model.Taza;
import com.castores.pruebatec.service.TazaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taza")

public class TazaResource {
    //controller
    private final TazaService tazaService;

    public TazaResource(TazaService tazaService) {
        this.tazaService = tazaService;
    } 

    @GetMapping("/all")
    public ResponseEntity <List<Taza>> getAllTazas(){
        List<Taza>tazas=tazaService.findAllTazas();
        return new ResponseEntity<>(tazas, HttpStatus.OK);
    }

    @GetMapping("/find/{id]")
    public ResponseEntity<Taza> getTazaById(@PathVariable("id") Long id){
        Taza taza=tazaService.findTazaById(id);
        return new ResponseEntity<>(taza, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Taza> addTaza(@RequestBody Taza taza){
        Taza newTaza=tazaService.addTaza(taza);
        return new ResponseEntity<>(newTaza, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Taza> updateTaza(@RequestBody Taza taza){
        Taza upTaza=tazaService.updateTaza(taza);
        return new ResponseEntity<>(upTaza, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTaza(@PathVariable("id") Long id){
        tazaService.deleteTaza(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
