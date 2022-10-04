
package com.co.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID=1L;
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_usuario;
    private String nombre_usuario;
    private String apellido_usuario;
    private String celular_usuario;
    private String correo_usuario;
    private String contrasena_usuario;

   
    
}
