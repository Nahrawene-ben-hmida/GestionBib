package com.example.servicelivre.configuration;

import com.example.servicelivre.entities.EmprunteLivre;
import com.example.servicelivre.entities.Livre;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {
 @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
       config.exposeIdsFor(Livre.class);
       config.exposeIdsFor(EmprunteLivre.class);
 }
}
