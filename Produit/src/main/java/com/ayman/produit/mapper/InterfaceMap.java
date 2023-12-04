package com.ayman.produit.mapper;

import com.ayman.produit.Entities.Produit;
import com.ayman.produit.dto.DTORequest;
import com.ayman.produit.dto.DTOResponse;

public interface InterfaceMap {


    public Produit dto2produit(DTORequest req);

    public DTOResponse produit2dto(Produit p);
}
