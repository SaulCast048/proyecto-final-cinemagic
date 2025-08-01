package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Administrador;
import com.metaphorce.cinemagic2.entidades.Cartelera;
import com.metaphorce.cinemagic2.entidades.Horario;
import com.metaphorce.cinemagic2.entidades.Pelicula;
/**
 *
 * @author saul_
 */

public interface AdministradorService {
    Administrador crearAdministrador();
    Administrador findAllAdministradores();
    Cartelera actualizarCartelera();
    Cartelera agregarPelicula();
    Horario agregarHorario();
    Pelicula verVentas();
    Pelicula verOpiniones();
    Pelicula verCalificaciones();
}
