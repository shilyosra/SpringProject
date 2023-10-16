package tn.esprit.firstspringbootproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Chambre;

import java.util.List;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Integer> {
    public List<Chambre> findByReservationsNull ();

}
