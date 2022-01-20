package com.example.servicelivre.dao;

import com.example.servicelivre.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface LivreRepository extends JpaRepository<Livre,Long> {
    @Query("select count(e) from Livre e")
    long countAllLivre();

    @Override
    List<Livre> findAll();
}
