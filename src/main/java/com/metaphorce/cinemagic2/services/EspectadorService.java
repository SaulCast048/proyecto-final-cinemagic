package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Boleto;
import com.metaphorce.cinemagic2.entidades.Espectador;
import com.metaphorce.cinemagic2.entidades.Opinion;
import com.metaphorce.cinemagic2.entidades.Cartelera;
/**
 *
 * @author saul_
 */
public interface EspectadorService {
    Boleto comprarBoleto();
    Boleto verBoleto();
    Cartelera verCartelera();
    Opinion verOpiniones();
    Opinion verCalificaciones();
    Opinion crearOpinion();
    Opinion CalificarPelicula();
}
