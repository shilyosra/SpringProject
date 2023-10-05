package tn.esprit.firstspringbootproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFoyer ;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne (mappedBy = "foyer")
    private  Universite universite ;
     @OneToMany (cascade = CascadeType.ALL, mappedBy = "foyer")
    private Set<Bloc> Blocs;



}
