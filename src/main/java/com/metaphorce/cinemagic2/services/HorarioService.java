package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Horario;
import java.util.List;

/**
 *
 * @author saul_
 */
public interface HorarioService {
    List<Horario> getHorarios();
    Horario agregarHorario(Horario nuevoHorario);
    Horario actualizarHorario(Integer id, Horario horarioActualizado);
    Horario encontrarHorario(Integer id);
    void eliminarHorario(Integer id);
}
