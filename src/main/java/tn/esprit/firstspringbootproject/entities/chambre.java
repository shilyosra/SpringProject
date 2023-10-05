package tn.esprit.firstspringbootproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;


    private int numchambre ;
    @Enumerated
    private ChambreType chambreType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "c1")
    private Set<Bloc> Blocs;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations ;
}
