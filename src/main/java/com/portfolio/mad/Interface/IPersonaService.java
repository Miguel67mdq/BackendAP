package com.portfolio.mad.Interface;

import com.portfolio.mad.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
    //Obtener lista de personas
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar objeto persona y lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
    
}
