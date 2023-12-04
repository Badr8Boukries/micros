package com.ayman.produit.service;

import com.ayman.produit.dto.DTORequest;
import com.ayman.produit.dto.DTOResponse;

import java.util.List;

public interface InterfaceService {

    public void add(DTORequest req);

    public List<DTOResponse> listerProduit();


    public  DTOResponse produitById(Integer id);

    public void update(Integer id , DTORequest req);


    public void supprimer(Integer id);

}
