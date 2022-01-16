package com.example.servicelivre.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmprunteLivre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date_emprunte;
    private Date date_retour;
    private Long idEtudiant;
    private Boolean isreturned = false ;

    @ManyToOne
    private Livre refLivre;
}
