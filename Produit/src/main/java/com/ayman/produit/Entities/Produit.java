package com.ayman.produit.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Produit {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String marque;
    Double prix;

    Integer quantie;
}
