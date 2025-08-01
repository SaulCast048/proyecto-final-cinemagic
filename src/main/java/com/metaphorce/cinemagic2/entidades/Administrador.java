package com.metaphorce.cinemagic2.entidades;

import com.metaphorce.cinemagic2.entidades.Cartelera;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 *
 * @author saul_
 */
@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private Integer idAdministrador;
    private String nombre;
    private String correo;
    @Column(name = "contrasenia")
    private String password;
    private Cartelera carteleraCine;
    
    public Administrador(String nombre, String correo, String password){
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }
    
    public Administrador(){
        
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Cartelera getCartelera(){
        return carteleraCine;
    }
    
    public void setCartelera(Cartelera carteleraCine){
        this.carteleraCine = carteleraCine;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + ", nombre=" + nombre + ", correo=" + correo + '}';
    }

    
    
}
