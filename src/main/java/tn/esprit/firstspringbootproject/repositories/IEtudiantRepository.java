package tn.esprit.firstspringbootproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Etudiant;

import java.util.Date;
import java.util.List;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Integer> {
    public List<Etudiant> findByDateNaissanceBetween (Date a , Date b);
}
