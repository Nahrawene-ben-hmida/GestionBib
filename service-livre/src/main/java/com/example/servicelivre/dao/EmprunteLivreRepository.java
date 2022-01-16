package com.example.servicelivre.dao;

import com.example.servicelivre.entities.EmprunteLivre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmprunteLivreRepository extends JpaRepository<EmprunteLivre,Long> {
}
