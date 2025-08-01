package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Pelicula;
import com.metaphorce.cinemagic2.entidades.Cartelera;
import com.metaphorce.cinemagic2.entidades.Horario;
import java.util.List;

/**
 *
 * @author saul_
 */
public interface CarteleraService {
    Cartelera agregarCartelera();
    Cartelera actualizarCartelera();
    Pelicula agregarPelicula();
    Horario mostrarHorarios();
    Pelicula mostrarPeliculas();
    void eliminarPelicula();
    void eliminarHorario();
    void eliminarCartelera();
    
}
