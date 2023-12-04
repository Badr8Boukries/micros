package com.ayman.achteur.service;

import com.ayman.achteur.DTO.DTORequest;
import com.ayman.achteur.DTO.DTOResponse;
import com.ayman.achteur.Entities.Achteur;
import com.ayman.achteur.Repository.RepositoryAcheur;
import com.ayman.achteur.mapper.InterfaceMap;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SerImp implements  SerInterface{

    @Autowired
    RepositoryAcheur p1;
    @Autowired
    InterfaceMap m;


    @Override
    public void add(DTORequest req) {
        Achteur a=m.dto2achteur(req);
        p1.save(a);


    }

    @Override
    public DTOResponse achteurById(Integer id) {

        Achteur a=new Achteur();
        a=p1.findById(id).get();
        DTOResponse rep=m.achteur2dto(a);

        return rep;
    }

    @Override
    public List<DTOResponse> listAchteur() {


        List<Achteur> le=new ArrayList<>();
        List<DTOResponse>l=new ArrayList<>();
        le=p1.findAll();

        for(Achteur a: le){
            DTOResponse r=new DTOResponse();

            r=m.achteur2dto(a);
            l.add(r);
        }

        return l;
    }

    @Override
    public void update(Integer id, DTORequest req) {

        Achteur a=new Achteur();
        a=p1.findById(id).get();

        if(req.getNom()!=null){

            a.setNom(req.getNom());
        }
        if(req.getVille()!=null){
            a.setVille(req.getVille());
        }
        p1.save(a);


    }

    @Override
    public void suprimer(Integer id) {
        p1.deleteById(id);

    }
}
