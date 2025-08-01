package com.metaphorce.cinemagic2.entidades;

import com.metaphorce.cinemagic2.entidades.Boleto;
import com.metaphorce.cinemagic2.entidades.Opinion;
import jakarta.persistence.*;
import java.util.List;
/**
 *
 * @author saul_
 */
@Entity
public class Espectador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_espectador")
    private Integer idEspectador;
    private String nombre;
    private String correo;
    private String password;
    private String telefono;
    private List<Boleto> boletoComprado;
    private Opinion opinionRealizada;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Boleto> getBoletoComprado() {
        return boletoComprado;
    }

    public void setBoletoComprado(List<Boleto> boletoComprado) {
        this.boletoComprado = boletoComprado;
    }

    public Opinion getOpinionRealizada() {
        return opinionRealizada;
    }

    public void setOpinionRealizada(Opinion opinionRealizada) {
        this.opinionRealizada = opinionRealizada;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", boletoComprado=" + boletoComprado + ", opinionRealizada=" + opinionRealizada + '}';
    }
    
    
    
}
