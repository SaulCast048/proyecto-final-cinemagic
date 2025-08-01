package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Boleto;
import com.metaphorce.cinemagic2.entidades.Asiento;
import com.metaphorce.cinemagic2.entidades.Pelicula;
import com.metaphorce.cinemagic2.entidades.Horario;
import java.util.List;
/**
 *
 * @author saul_
 */
public interface BoletoService {
    Boleto crearBoleto();
    Asiento elegirAsiento();
    Pelicula elegirPelicula();
    Horario elegirHorario();
    Boleto mostrarBoleto();
    Boleto agregarVenta();
    
}
