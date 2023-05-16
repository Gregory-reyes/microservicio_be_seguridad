package edu.mintic2022.ms_seguridad.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
@Document()
@Data
public class Rol {
    @Id
    @Setter(AccessLevel.NONE)
    private String _id;
    private String tipo;
    private String descripcion;
}
