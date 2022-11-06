package edu.mintic2022.ms_seguridad.modelos;
import org.springframework.data.annotation.Id;
//  import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mongodb.lang.NonNull;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Document()
@Data  //crea automaticamente los setters y getters
public class Usuario {
    @Id
    @Setter(AccessLevel.NONE)
    private String _id;

    private String seudonimo;
    @NonNull private String e_mail;
    @NonNull private String contrasena;
    //@NonNull  @DBRef private Rol rol;  //Clave foranea

    //Modificando el get y el set de la contraseña de forma manual
    @JsonIgnore //anotación de ignorar la contraseña
    public String getContrsena(){
    return contrasena;
    }
    @JsonProperty 
    public void setContrasena(String contrasena){
    if(contrasena != null) this.contrasena = contrasena;        
    }

}
