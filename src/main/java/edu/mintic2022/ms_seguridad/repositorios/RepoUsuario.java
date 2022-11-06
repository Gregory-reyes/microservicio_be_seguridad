package edu.mintic2022.ms_seguridad.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.mintic2022.ms_seguridad.modelos.Usuario;

public interface RepoUsuario extends MongoRepository<Usuario,String>{ //hereda de MongoRepository
    
}
