package tn.esprit.firstspringbootproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Foyer;

@Repository
public interface IFoyerRepository extends CrudRepository<Foyer,Integer> {
}
