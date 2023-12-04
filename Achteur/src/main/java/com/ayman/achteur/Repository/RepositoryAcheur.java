package com.ayman.achteur.Repository;

import com.ayman.achteur.Entities.Achteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//@RepositoryRestResource

public interface RepositoryAcheur  extends JpaRepository<Achteur,Integer> {

}
