
package com.co.dao;

import com.co.pojo.Mascota;

import org.springframework.data.repository.CrudRepository;

public interface MascotaDAO extends CrudRepository<Mascota,Integer> {
    
}
