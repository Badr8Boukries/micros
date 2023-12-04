package com.ayman.produit.web;

import com.ayman.produit.Entities.Produit;
import com.ayman.produit.Repository.RepositoryProduit;
import com.ayman.produit.dto.DTORequest;
import com.ayman.produit.dto.DTOResponse;
import com.ayman.produit.mapper.InterfaceMap;
import com.ayman.produit.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerRest {

@Autowired
    RepositoryProduit p1;

    @GetMapping("produits")

    public List<Produit> getAll(){

        return  p1.findAll();
    }

    /*
    @Autowired
    InterfaceService s;

    @Autowired
    InterfaceMap m;


    @GetMapping("/produits")

    public List<DTOResponse> getAll(){

        return s.listerProduit();
    }

    @GetMapping("/produits/{id}")

    public DTOResponse getById( @PathVariable("id") Integer id){

    return s.produitById(id);
    }


    @PostMapping("/produits")
    public void add( @RequestBody DTORequest req){

            s.add(req);
    }
    @PutMapping("/produits/{id}")

    public void update(@PathVariable("id") Integer id,@RequestBody DTORequest req){

        s.update(id,req);
    }

    @DeleteMapping("/produits/{id}")

    public void delete( @PathVariable("id") Integer id){

        s.supprimer(id);
    }


     */
}
