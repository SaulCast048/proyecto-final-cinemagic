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
    Cartelera agregarCartelera(Cartelera nuevaCartelera);
    Cartelera actualizarCartelera(Integer id, Cartelera carteleraActualizada);
    List<Pelicula> mostrarPeliculas(Integer Id);
    void eliminarCartelera(Integer id);
    
}
