package com.ayman.produit.Repository;

import com.ayman.produit.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduit extends JpaRepository<Produit,Integer> {
}
