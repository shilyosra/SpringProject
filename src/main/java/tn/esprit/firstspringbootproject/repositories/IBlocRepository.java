package tn.esprit.firstspringbootproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Bloc;

@Repository
public interface IBlocRepository extends CrudRepository <Bloc,Integer> {
}
