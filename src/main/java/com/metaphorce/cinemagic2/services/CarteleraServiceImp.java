package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Cartelera;
import com.metaphorce.cinemagic2.entidades.Pelicula;
import com.metaphorce.cinemagic2.entidades.Horario;
import com.metaphorce.cinemagic2.repositories.CarteleraRepository;
import com.metaphorce.cinemagic2.repositories.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saul_
 */
@Service
public class CarteleraServiceImp {
    @Autowired
    CarteleraRepository cartelerarepository;
    PeliculaRepository pelicularepository;
    
    
    Cartelera agregarCartelera(Cartelera nuevaCartelera){
        return cartelerarepository.save(nuevaCartelera);
    }
    
    Cartelera buscarCarteleraPorId(Integer id){
        return cartelerarepository.findById(id).orElse(null);
    }
    
    Cartelera actualizarCartelera(Integer id, List<Pelicula> nuevasPeliculas){
        Cartelera carteleraParaActualizar = buscarCarteleraPorId(id);
        carteleraParaActualizar.setPeliculasDisponibles(nuevasPeliculas);
        return cartelerarepository.save(carteleraParaActualizar);
    }
    
    List<Pelicula> mostrarPeliculas(){
        return pelicularepository.findAll();
    }
    
    void eliminarCartelera(Integer idCartelera){
        cartelerarepository.deleteById(idCartelera);
    }
    
}
