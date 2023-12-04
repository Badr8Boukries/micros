package com.ayman.achteur.service;

import com.ayman.achteur.DTO.DTORequest;
import com.ayman.achteur.DTO.DTOResponse;

import java.util.List;

public interface SerInterface {


    public void add(DTORequest req);

    public DTOResponse achteurById(Integer id);

    public List<DTOResponse>  listAchteur();

    public void update (Integer id, DTORequest req);

    public  void suprimer (Integer id);


}
