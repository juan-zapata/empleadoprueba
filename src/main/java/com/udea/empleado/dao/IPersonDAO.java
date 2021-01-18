
package com.udea.empleado.dao;

import com.udea.empleado.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonDAO extends CrudRepository<Persona, Long> {
    
}