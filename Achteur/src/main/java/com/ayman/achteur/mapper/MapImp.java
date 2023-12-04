package com.ayman.achteur.mapper;

import com.ayman.achteur.DTO.DTORequest;
import com.ayman.achteur.DTO.DTOResponse;
import com.ayman.achteur.Entities.Achteur;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MapImp implements  InterfaceMap{
    @Override
    public Achteur dto2achteur(DTORequest req) {
        Achteur a=new Achteur();
        BeanUtils.copyProperties(req,a);
        return a;
    }

    @Override
    public DTOResponse achteur2dto(Achteur rep) {
        DTOResponse a=new DTOResponse();
        BeanUtils.copyProperties(rep,a);
        return a;
    }
}
