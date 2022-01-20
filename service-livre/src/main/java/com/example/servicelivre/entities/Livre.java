package com.example.servicelivre.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Livre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String author;


    @OneToMany(mappedBy = "refLivre",cascade = CascadeType.ALL)
    private List<EmprunteLivre> emprunteLivresList;

}



