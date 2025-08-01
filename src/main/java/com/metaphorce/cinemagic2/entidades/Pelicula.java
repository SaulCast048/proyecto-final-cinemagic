/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.metaphorce.cinemagic2.entidades;

import com.metaphorce.cinemagic2.entidades.Horario;
import com.metaphorce.cinemagic2.entidades.Opinion;
import java.util.List;
import jakarta.persistence.*;
/**
 *
 * @author saul_
 */
@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Integer idPelicula;
    private String nombre;
    private String clasificacion;
    private String sinopsis;
    private Integer ventas;
    private Horario horarioFuncion;
    private Opinion opinionesPelicula;
    
    public Pelicula(String nombre, String clasificacion, String sinopsis){
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
    }
    
    public Pelicula(){}

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getVentas() {
        return ventas;
    }

    public void setVentas(Integer ventas) {
        this.ventas = ventas;
    }
    
    public void aumentarVentas(){
        this.ventas += 1;
    }

    public Horario getHorarioFuncion() {
        return horarioFuncion;
    }

    public void setHorarioFuncion(Horario horarioFuncion) {
        this.horarioFuncion = horarioFuncion;
    }

    public Opinion getOpinionesPelicula() {
        return opinionesPelicula;
    }

    public void setOpinionesPelicula(Opinion opinionesPelicula) {
        this.opinionesPelicula = opinionesPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", nombre=" + nombre + ", clasificacion=" + clasificacion + ", sinopsis=" + sinopsis + ", horarioFuncion=" + horarioFuncion + '}';
    }

    
    
    
}
