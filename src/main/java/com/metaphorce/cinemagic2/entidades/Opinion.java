package com.metaphorce.cinemagic2.entidades;

import jakarta.persistence.*;
/**
 *
 * @author saul_
 */

@Entity
public class Opinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opinion")
    private Integer idOpinion;
    private Integer calificacion;
    @Column(name = "opinion")
    private String comentarios;
    
    public Opinion(Integer calificacion, String comentarios){
        this.calificacion = calificacion;
        this.comentarios = comentarios;
    }
    
    public Opinion(){}

    public Integer getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(Integer idOpinion) {
        this.idOpinion = idOpinion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Opinion{" + "idOpinion=" + idOpinion + ", calificacion=" + calificacion + ", comentarios=" + comentarios + '}';
    }
    
    
}
