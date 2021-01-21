
package com.udea.empleado.service;

import com.udea.empleado.dao.IPersonDAO;
import com.udea.empleado.model.Persona;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {
    
    @Autowired
    private IPersonDAO dao;
    
    public Persona save(Persona t) {return dao.save(t);}
    public Persona update(Persona t) {return dao.save(t);}
    public void delete(Persona t) {dao.delete(t);}
    public Iterable<Persona> list() {return dao.findAll();}
    
    
    public Optional<Persona> listId(long id) {return dao.findById(id);}
    
    
}

