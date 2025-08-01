/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Opinion;
import com.metaphorce.cinemagic2.repositories.OpinionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saul_
 */
@Service
public class OpinionServiceImp {
    @Autowired
    OpinionRepository opinionrepository;
    
    List<Opinion>getOpiniones(){
        return opinionrepository.findAll();
    }
    
    Opinion buscarOpinionPorId(Integer id){
        return opinionrepository.findById(id).orElse(null);
    }
    
    Opinion crearOpinion(Integer calificacion, String comentarios){
        Opinion nuevaOpinion = new Opinion(calificacion, comentarios);
        return opinionrepository.save(nuevaOpinion);
    }
    
    Opinion editarOpinion(Integer id, String opinionEditada){
        Opinion opinionParaEditar = buscarOpinionPorId(id);
        opinionParaEditar.setComentarios(opinionEditada);
        return opinionrepository.save(opinionParaEditar);
    }
    
    Opinion editarCalificacion(Integer id, Integer calificacionEditada){
        Opinion calificacionParaEditar = buscarOpinionPorId(id);
        calificacionParaEditar.setCalificacion(calificacionEditada);
        return opinionrepository.save(calificacionParaEditar);
    }

    void eliminarOpinion(Integer id){
        opinionrepository.deleteById(id);
    }
}
