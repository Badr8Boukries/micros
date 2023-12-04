package com.ayman.achteur.mapper;

import com.ayman.achteur.DTO.DTORequest;
import com.ayman.achteur.DTO.DTOResponse;
import com.ayman.achteur.Entities.Achteur;
import org.springframework.stereotype.Component;



public interface InterfaceMap {


    public Achteur dto2achteur(DTORequest req);
    public DTOResponse achteur2dto(Achteur rep);
}
