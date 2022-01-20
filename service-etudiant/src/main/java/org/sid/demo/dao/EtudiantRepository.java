package org.sid.demo.dao;

import org.sid.demo.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    @Query("Select count(e) from Etudiant e where e.resultat= ?1 ")
    long countEtudiantsByResultat(String resultat);

    @Query("Select count(e) from Etudiant e")
    long countAllEtudiants();

    long countAllByResultatNotNull();
}
