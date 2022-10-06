
package com.co.pojo;

import java.io.Serializable;
import javax.persistence.Column;
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
    @Column (name = "nombre_usuario", nullable=false, length= 100)
    private String nombre_usuario;
    
    @Column (name = "apellido_usuario", nullable=true, length= 100)
    private String apellido_usuario;
    
    @Column (name = "celular_usuario", nullable=true, length= 100)
    private String celular_usuario;
    
    @Column (name = "correo_usuario", nullable=true, length= 100, unique=true)
    private String correo_usuario;
    
    @Column (name = "contrasena_usuario", nullable=true, length= 100)
    private String contrasena_usuario;

    public Usuario() {
    }

    
    public Usuario( String nombre_usuario, String apellido_usuario, String celular_usuario, String correo_usuario, String contrasena_usuario) {
 //       super();
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.celular_usuario = celular_usuario;
        this.correo_usuario = correo_usuario;
        this.contrasena_usuario = contrasena_usuario;
    }
}
