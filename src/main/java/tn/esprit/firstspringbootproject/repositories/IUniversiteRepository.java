package tn.esprit.firstspringbootproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Universite;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
    public Universite findByNomUniversiteAndAdresse (String nom, String adresse);




}
