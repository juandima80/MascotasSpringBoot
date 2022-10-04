
package com.co.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name="mascota")
public class Mascota implements Serializable{
    private static final long serialVersionUID=1L;
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_mascota;
    private String nombre_mascota;
    private String raza_mascota;
    private String tipo_busqueda_mascota;
    private String edad_aproximada_mascota;
    private String sexo_mascota;
    private String color_mascota;
    private Date fecha_mascota;
    private String estado_busqueda_mascota;
    private String foto_mascota;
    private int id_especie_mascota;
    private int id_usuario_mascota;

    public Mascota() {
    }
    
    

    public Mascota(int id_mascota, String nombre_mascota, String raza_mascota, String tipo_busqueda_mascota, String edad_aproximada_mascota, String sexo_mascota, String color_mascota, Date fecha_mascota, String estado_busqueda_mascota, String foto_mascota, int id_especie_mascota, int id_usuario_mascota) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza_mascota = raza_mascota;
        this.tipo_busqueda_mascota = tipo_busqueda_mascota;
        this.edad_aproximada_mascota = edad_aproximada_mascota;
        this.sexo_mascota = sexo_mascota;
        this.color_mascota = color_mascota;
        this.fecha_mascota = fecha_mascota;
        this.estado_busqueda_mascota = estado_busqueda_mascota;
        this.foto_mascota = foto_mascota;
        this.id_especie_mascota = id_especie_mascota;
        this.id_usuario_mascota = id_usuario_mascota;
    }
    
    

    
}
