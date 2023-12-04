package com.ayman.produit.mapper;

import com.ayman.produit.Entities.Produit;
import com.ayman.produit.dto.DTORequest;
import com.ayman.produit.dto.DTOResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MapImp implements  InterfaceMap {

    @Override
    public Produit dto2produit(DTORequest req) {

        Produit p=new Produit();

        BeanUtils.copyProperties(req,p);
        return p;
    }

    @Override
    public DTOResponse produit2dto(Produit p) {

        DTOResponse d=new DTOResponse();
        BeanUtils.copyProperties(p,d);
        return d;
    }
}
