package com.ayman.achteur.Entities;


import com.ayman.achteur.model.Produit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.language.bm.Lang;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Achteur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nom;
    String ville ;

    private Integer idProduit;
    @Transient
    private Produit produit;
}
