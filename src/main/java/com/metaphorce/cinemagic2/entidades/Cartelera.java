package com.metaphorce.cinemagic2.entidades;

import com.metaphorce.cinemagic2.entidades.Pelicula;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.List;
/**
 *
 * @author saul_
 */
@Entity
public class Cartelera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartelera")
    private Integer idCartelera;
    private List<Pelicula> peliculasDisponibles;
    
    public Cartelera(List<Pelicula> peliculasDisponibles){
        this.peliculasDisponibles = peliculasDisponibles;
    }
    
    public Cartelera(){}

    public Integer getIdCartelera() {
        return idCartelera;
    }

    public void setIdCartelera(Integer idCartelera) {
        this.idCartelera = idCartelera;
    }

    public List<Pelicula> getPeliculasDisponibles() {
        return peliculasDisponibles;
    }

    public void setPeliculasDisponibles(List<Pelicula> peliculasDisponibles) {
        this.peliculasDisponibles = peliculasDisponibles;
    }

    @Override
    public String toString() {
        return "Cartelera{" + "idCartelera=" + idCartelera + ", peliculasDisponibles=" + peliculasDisponibles + '}';
    }

    
    
}
