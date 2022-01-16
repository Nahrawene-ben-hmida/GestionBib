package org.sid.demo.configuration;

import org.sid.demo.entities.*;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import org.springframework.stereotype.Component;

@Component
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {
 @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

     config.exposeIdsFor(Etudiant.class);




 }
}
