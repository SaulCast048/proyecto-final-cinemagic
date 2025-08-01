package com.metaphorce.cinemagic2.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 *
 * @author saul_
 */
@Entity
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asiento")
    private Integer idAsiento;
    private Integer fila;
    private String columna;
    private Boolean disponibilidad;
    
    public Asiento(Integer fila, String columna, Boolean disponibilidad){
        this.fila = fila;
        this.columna = columna;
        this.disponibilidad = disponibilidad;
        
        
    }

    public Integer getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(Integer idAsiento) {
        this.idAsiento = idAsiento;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Asiento{" + "idAsiento=" + idAsiento + ", fila=" + fila + ", columna=" + columna + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
}
