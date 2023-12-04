package com.ayman.produit.service;

import com.ayman.produit.Entities.Produit;
import com.ayman.produit.Repository.RepositoryProduit;
import com.ayman.produit.dto.DTORequest;
import com.ayman.produit.dto.DTOResponse;
import com.ayman.produit.mapper.InterfaceMap;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ServiceImp implements InterfaceService{

    @Autowired
    RepositoryProduit p1;

    @Autowired
    InterfaceMap m;
    @Override
    public void add(DTORequest req) {

        Produit p=new Produit();
        p=m.dto2produit(req);

        p1.save(p);

    }

    @Override
    public List<DTOResponse> listerProduit() {

        List<Produit> l=new ArrayList<>();
        List<DTOResponse> lr=new ArrayList<>();

        l=p1.findAll();
        for(Produit p:l){

            DTOResponse rep=new DTOResponse();
            rep=m.produit2dto(p);
            lr.add(rep);
        }
        return lr;
    }

    @Override
    public DTOResponse produitById(Integer id) {

        Produit p=new Produit();
        p=p1.findById(id).get();

        DTOResponse rep=m.produit2dto(p);
        return rep;
    }

    @Override
    public void update(Integer id, DTORequest req) {


        Produit p=p1.findById(id).get();

        if(req.getMarque()!=null){
            p.setMarque(req.getMarque());
        }
        if(req.getPrix()!=null){
            p.setPrix(req.getPrix());
        }
        if(req.getQuantie()!=null){
            p.setQuantie(req.getQuantie());
        }

        p1.save(p);


    }

    @Override
    public void supprimer(Integer id) {


        p1.deleteById(id);

    }
}
