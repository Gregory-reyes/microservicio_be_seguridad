package edu.mintic2022.ms_seguridad.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.mintic2022.ms_seguridad.modelos.Usuario;

public interface RepoUsuario extends MongoRepository<Usuario,String>{

    @Query(value="{}",fields = "{seudonimo:0, rol:0}")
    Usuario findByEmail(String email); //hereda de MongoRepository

    @Aggregation(pipeline = { //queri y agregaciones consultas en mongo atlas

    })
    List<Usuario> findByRol(String rol);
    
}
