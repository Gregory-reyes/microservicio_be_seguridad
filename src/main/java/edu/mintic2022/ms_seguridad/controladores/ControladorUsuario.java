package edu.mintic2022.ms_seguridad.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.mintic2022.ms_seguridad.modelos.Usuario;
import edu.mintic2022.ms_seguridad.repositorios.RepoUsuario;

@RestController
@CrossOrigin
@RequestMapping("/usuarios") //anotaciones que conectan con el frameword
public class ControladorUsuario {
    @Autowired  //Autowired instancia automaticamente el frameword con la anotación
    private RepoUsuario repositorio; 

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public MappingJacksonValue index(){
        return null;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("{id}")
    public Usuario retrieve(@PathVariable String id){
        return null;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario create(@RequestBody Usuario infoUsuario){
        return null;
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("{id}")
    public Usuario update(@PathVariable String id, @RequestBody Usuario infoUsuario){
        return null;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){

    }
}
