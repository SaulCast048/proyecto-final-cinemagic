package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Pelicula;
import com.metaphorce.cinemagic2.entidades.Horario;
import com.metaphorce.cinemagic2.entidades.Opinion;
import java.util.List;
/**
 *
 * @author saul_
 */
public interface PeliculaService {
    List<Pelicula> getAllPeliculas();
    Pelicula agregarPelicula();
    Pelicula buscarPeliculaPorId();
    Pelicula editarVentas(Integer id);
    Integer mostrarVentas(Integer id);
    Pelicula editarNombrePelicula(Integer id, String nuevoNombre);
    Pelicula editarSinopsisPelicula(Integer id, String nuevaSinopsis);
    Pelicula editarClasificacionPelicula(Integer id, String nuevaClasificacion); 
    String mostrarDatosPelicula(Integer id);
    Pelicula agregarHorario(Horario horario);
    String mostrarHorarios(Integer id);
    Pelicula agregarOpinion(Opinion opinion);
    Pelicula editarCalificacion(Integer nuevaCalificacion);
    String mostrarOpinion();
    void eliminarPelicula(Integer id);
    
}
