package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Opinion;
import com.metaphorce.cinemagic2.entidades.Pelicula;
import java.util.List;

/**
 *
 * @author saul_
 */
public interface OpinionService {
    List<Opinion> getOpiniones();
    Opinion crearOpinion(Integer calificacion, String comentarios);
    Opinion buscarOpinionPorId(Integer id);
    Opinion editarOpinion(Integer id, String opinionEditada);
    Opinion editarCalificacion(Integer id, Integer calificacionEditada);
    Opinion eliminarOpinion(Integer id);
    
}
