package com.ayman.achteur;

import com.ayman.achteur.Entities.Achteur;
import com.ayman.achteur.Repository.RepositoryAcheur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AchteurApplication implements CommandLineRunner {

    @Autowired
    RepositoryAcheur p1;



    public static void main(String[] args) {
        SpringApplication.run(AchteurApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Achteur a=new Achteur(null,"ayman","rabat",1,null);
        Achteur a1 = new Achteur(null, "Fatima", "Casablanca",3,null);
        Achteur a2 = new Achteur(null, "Mehdi", "Tanger",2,null);
        Achteur a3 = new Achteur(null, "Lina", "Marrakech",3,null);
        Achteur a4 = new Achteur(null, "jamal", "Fes",2,null);






        p1.save(a);
        p1.save(a1);
        p1.save(a2);
        p1.save(a3);
        p1.save(a4);

        System.out.println("achteur marche tres bien");

    }
}
