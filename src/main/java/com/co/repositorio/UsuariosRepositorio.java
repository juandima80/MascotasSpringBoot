
package com.co.repositorio;

import com.co.pojo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepositorio extends JpaRepository<Usuario,Long>{
    //aqui van las consultas, se realizan con Query (Select *)
    
}
