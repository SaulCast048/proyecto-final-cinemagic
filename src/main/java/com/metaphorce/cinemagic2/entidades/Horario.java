package com.metaphorce.cinemagic2.entidades;

import jakarta.persistence.*;

/**
 *
 * @author saul_
 */
@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Integer idHorario;
    private Integer dia;
    private Integer mes;
    private Integer anio;
    private String hora;
    
    public Horario(Integer dia, Integer mes, Integer anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Horario(){}

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    public String getHora(){
        return hora;
    }
    
    public void setHora(String hora){
        this.hora = hora;
    }
    

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", hora="+ hora + '}';
    }
    
    
    
}
