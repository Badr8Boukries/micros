package com.ayman.achteur.produit;


import com.ayman.achteur.model.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="PRODUIT-SERVICE")
public interface produitOpenFeingControler {


    @GetMapping("/api/produits")

    public List<Produit> getAllProducts();

    @GetMapping("/produits/{id}")
    public Produit findBy ( @PathVariable  Integer id);
}
