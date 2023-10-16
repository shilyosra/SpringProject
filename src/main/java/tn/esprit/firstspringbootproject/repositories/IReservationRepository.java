package tn.esprit.firstspringbootproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstspringbootproject.entities.Reservation;

@Repository
public interface IReservationRepository extends CrudRepository <Reservation,Long> {
}
