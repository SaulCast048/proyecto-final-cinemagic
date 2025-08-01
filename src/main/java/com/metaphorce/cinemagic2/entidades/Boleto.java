package com.metaphorce.cinemagic2.entidades;

import com.metaphorce.cinemagic2.entidades.Pelicula;
import com.metaphorce.cinemagic2.entidades.Asiento;
import com.metaphorce.cinemagic2.entidades.Horario;
import jakarta.persistence.Entity;
import jakarta.persistence.*;


/**
 *
 * @author saul_
 */
@Entity
public class Boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleto")
    private Integer idBoleto;
    private String metodoPago;
    private Pelicula peliculaElegida;
    private Horario horarioPelicula;
    private Asiento asientoElegido;

    public Integer getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Pelicula getPeliculaElegida() {
        return peliculaElegida;
    }

    public void setPeliculaElegida(Pelicula peliculaElegida) {
        this.peliculaElegida = peliculaElegida;
    }

    public Horario getHorarioPelicula() {
        return horarioPelicula;
    }

    public void setHorarioPelicula(Horario horarioPelicula) {
        this.horarioPelicula = horarioPelicula;
    }

    public Asiento getAsientoElegido() {
        return asientoElegido;
    }

    public void setAsientoElegido(Asiento asientoElegido) {
        this.asientoElegido = asientoElegido;
    }

    @Override
    public String toString() {
        return "Boleto{" + "idBoleto=" + idBoleto + ", metodoPago=" + metodoPago + ", peliculaElegida=" + peliculaElegida + ", horarioPelicula=" + horarioPelicula + ", asientoElegido=" + asientoElegido + '}';
    }
    
    
    
    
}
