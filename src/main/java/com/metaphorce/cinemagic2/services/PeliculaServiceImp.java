package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Pelicula;
import com.metaphorce.cinemagic2.entidades.Opinion;
import com.metaphorce.cinemagic2.entidades.Horario;
import com.metaphorce.cinemagic2.repositories.PeliculaRepository;
import com.metaphorce.cinemagic2.repositories.HorarioRepository;
import com.metaphorce.cinemagic2.repositories.OpinionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author saul_
 */
@Service
public class PeliculaServiceImp {
    @Autowired
    PeliculaRepository pelicularepository;
    HorarioRepository horariorepository;
    OpinionRepository opinionrepository;
    
    List<Pelicula> getAllPeliculas(){
        return pelicularepository.findAll();
    }
    
    Pelicula agregarPelicula(Pelicula nuevaPelicula){
        return pelicularepository.save(nuevaPelicula);
    }
    
    Pelicula buscarPeliculaPorId(Integer id){
        return pelicularepository.findById(id).orElse(null);
    }
    
    Pelicula editarVentas(Integer id){
        Pelicula peliculaVendida = buscarPeliculaPorId(id);
        peliculaVendida.aumentarVentas();
        return pelicularepository.save(peliculaVendida);
    }
    
    Integer mostrarVentas(Integer id){
        Pelicula peliculaVendida = buscarPeliculaPorId(id);
        return(peliculaVendida.getVentas());
    }
    
    Pelicula editarNombrePelicula(Integer id, String nuevoNombre){
        Pelicula peliculaEditada = buscarPeliculaPorId(id);
        peliculaEditada.setNombre(nuevoNombre);
        return pelicularepository.save(peliculaEditada);
    }
    
    Pelicula editarSinopsisPelicula(Integer id, String nuevaSinopsis){
        Pelicula peliculaEditada = buscarPeliculaPorId(id);
        peliculaEditada.setSinopsis(nuevaSinopsis);
        return pelicularepository.save(peliculaEditada);
    }
    
    Pelicula editarClasificacionPelicula(Integer id, String nuevaClasificacion){
        Pelicula peliculaEditada = buscarPeliculaPorId(id);
        peliculaEditada.setNombre(nuevaClasificacion);
        return pelicularepository.save(peliculaEditada);
    }
    
    String mostrarDatosPelicula(Integer id){
        Pelicula peliculaBuscada = buscarPeliculaPorId(id);
        return(peliculaBuscada.toString());
    }
    
    Pelicula agregarHorario(Integer id, Horario horario){
        Pelicula peliculaAgendada = buscarPeliculaPorId(id);
        peliculaAgendada.setHorarioFuncion(horario);
        return pelicularepository.save(peliculaAgendada);
    }
    
    String mostrarHorarios(Integer id){
        Pelicula peliculaBuscada = buscarPeliculaPorId(id);
        Horario horarioPelicula = peliculaBuscada.getHorarioFuncion();
        return(horarioPelicula.toString());
    }
    
    Pelicula agregarOpinion(Integer id, Opinion opinion){
        Pelicula peliculaVista = buscarPeliculaPorId(id);
        peliculaVista.setOpinionesPelicula(opinion);
        return pelicularepository.save(peliculaVista);
        
    }
    
    String mostrarOpinion(Integer id){
        Pelicula peliculaOpinada = buscarPeliculaPorId(id);
        Opinion opinionBuscada = peliculaOpinada.getOpinionesPelicula();
        return(opinionBuscada.toString());
    }
    
    void eliminarPelicula(Integer id){
        pelicularepository.deleteById(id);
    }
    
}
