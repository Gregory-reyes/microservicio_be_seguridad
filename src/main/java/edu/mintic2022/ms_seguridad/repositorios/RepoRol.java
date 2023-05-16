package edu.mintic2022.ms_seguridad.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.mintic2022.ms_seguridad.modelos.Rol;

public interface RepoRol extends MongoRepository<Rol,String>{
    
}
