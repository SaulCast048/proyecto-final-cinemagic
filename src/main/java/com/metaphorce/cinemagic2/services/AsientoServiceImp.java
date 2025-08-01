package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Asiento;
import com.metaphorce.cinemagic2.repositories.AsientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saul_
 */
@Service
public class AsientoServiceImp {
    @Autowired
    AsientoRepository asientorepository;
    
    List<Asiento> getAllAsientos(){
        return asientorepository.findAll();
    }
    
    List<Asiento> getAsientosDisponibles(){
        List<Asiento> asientosDisponibles = List.of();
        List<Asiento> allAsientos = getAllAsientos();
        for(Asiento asiento : allAsientos){
            if(asiento.getDisponibilidad() == true)
                asientosDisponibles.add(asiento);
        }
        return(asientosDisponibles);
    }
    
    List<Asiento> getAsientosOcupados(){
        List<Asiento> asientosOcupados = List.of();
        List<Asiento> allAsientos = getAllAsientos();
        for(Asiento asiento : allAsientos){
            if(asiento.getDisponibilidad() == false){
                asientosOcupados.add(asiento);
            }
        }
        return(asientosOcupados);
    }
    
    Asiento buscarAsientosPorId(Integer id){
        return asientorepository.findById(id).orElse(null);
    }
    
    boolean verDisponibilidadAsiento(Integer id){
        Asiento asientoBuscado = buscarAsientosPorId(id);
        return(asientoBuscado.getDisponibilidad());
    }
    
    Asiento editarDisponibilidad(Integer id){
        Asiento asientoParaEditar = buscarAsientosPorId(id);
        
        if(asientoParaEditar.getDisponibilidad() == false){
        asientoParaEditar.setDisponibilidad(true);
        } else{
            asientoParaEditar.setDisponibilidad(false);
        }
        return asientorepository.save(asientoParaEditar);
    }
    
    void eliminarAsiento(Integer id){
        asientorepository.deleteById(id);
    }
}
