package com.ayman.achteur.web;

import com.ayman.achteur.Entities.Achteur;
import com.ayman.achteur.Repository.RepositoryAcheur;
import com.ayman.achteur.model.Produit;
import com.ayman.achteur.produit.produitOpenFeingControler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController


public class ControllerRest {

    @Autowired
    RepositoryAcheur achateurRep;

    @Autowired
    produitOpenFeingControler prod;


/*

    @GetMapping("/achteurs")
    public List<Achteur> getall(){

        List<Produit> lp= prodof.findAll();
        List<Achteur> la = new ArrayList<>();
        la = achateurRep.findAll();


        for (Achteur a: la){

            for(Produit p: lp){

                if(a.getIdProduit()==p.getId()){

                    a.setProduit(p); break;

                }

            }
        }



        return la;
    }
*/


    @GetMapping("/achteurs")

    public List<Achteur> getAll() {

        List<Achteur>l=new ArrayList<>();

        l=achateurRep.findAll();


List<Produit> lp=new ArrayList<>();
lp=prod.getAllProducts();

        for (Achteur a: l){

            for(Produit p: lp){

                if(a.getIdProduit()==p.getId()){

                    a.setProduit(p); break;

                }

            }
        }
        return l;

    }

    @GetMapping("/achteurs/{id}")

    public  Achteur getone(@PathVariable("id") Integer id){
        Achteur e = achateurRep.findById(id).get();

        Produit p= prod.findBy(e.getIdProduit());

        e.setProduit(p);
        return e;
    }



    /*
    @Autowired
    SerInterface s;

    @GetMapping("/achteurs")
    public List<DTOResponse> getAll(){

        return s.listAchteur();
    }
    @GetMapping("achteurs/{id}")
    public DTOResponse get( @PathVariable("id")  Integer  id ){

        return s.achteurById(id);

    }


    @PostMapping("/achteurs")

    public  void add(@RequestBody DTORequest req){

        s.add(req);

    }

    @PutMapping("/achteurs/{id}")
    public void update( @PathVariable("id") Integer id, @RequestBody DTORequest req){

        s.update(id,req);

    }

    @DeleteMapping("/achteurs/{id}")

    public void delete(@PathVariable ("id") Integer id){

        s.suprimer(id);
    }

     */






}
