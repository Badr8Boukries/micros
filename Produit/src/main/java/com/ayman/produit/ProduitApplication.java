package com.ayman.produit;

import com.ayman.produit.Entities.Produit;
import com.ayman.produit.Repository.RepositoryProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner {

        @Autowired
    RepositoryProduit p1;
    public static void main(String[] args) {
        SpringApplication.run(ProduitApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Produit p=new Produit(null,"gucci",2000.00,3);
        Produit p2 = new Produit(null, "Adidas", 150.00, 5);
        Produit p3 = new Produit(null, "Samsung TV", 899.99, 10);
        Produit p4 = new Produit(null, "iPhone 13", 999.00, 7);
        Produit p5 = new Produit(null, "Le Petit Prince", 12.50, 20);





        p1.save(p);
        p1.save(p2);
        p1.save(p3);
        p1.save(p4);
        p1.save(p5);
        System.out.println("produit marche tres bien");
    }
}
