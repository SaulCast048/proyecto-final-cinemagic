package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.repositories.HorarioRepository;
import com.metaphorce.cinemagic2.entidades.Horario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author saul_
 */
@Service
public class HorarioServiceImp implements HorarioService{
    @Autowired
    HorarioRepository horariorepository;
    
    public List<Horario> getHorarios(){
        return horariorepository.findAll();
    }
    
    public Horario encontrarHorario(Integer id){
        return horariorepository.findById(id).orElse(null);
    }
    
    public Horario agregarHorario(Horario nuevoHorario){
        return horariorepository.save(nuevoHorario);
        
    }
    
    public Horario actualizarHorario(Integer id, Horario horarioActualizado){
        Horario horarioPorActualizar;
        horarioPorActualizar = encontrarHorario(id);
        horarioPorActualizar.setDia(horarioActualizado.getDia());
        horarioPorActualizar.setMes(horarioActualizado.getMes());
        horarioPorActualizar.setAnio(horarioActualizado.getAnio());
        horarioPorActualizar.setHora(horarioActualizado.getHora());
        return horariorepository.save(horarioPorActualizar);
    }
    
    public void eliminarHorario(Integer id){
      horariorepository.deleteById(id);
    }

}
