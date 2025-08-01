package com.metaphorce.cinemagic2.services;

import com.metaphorce.cinemagic2.entidades.Asiento;
import java.util.List;

/**
 *
 * @author saul_
 */
public interface AsientoService {
    List<Asiento> getAllAsientos();
    List<Asiento> getAsientosDisponibles();
    List<Asiento> getAsientosOcupados();
    Asiento asignarAsiento(Integer fila, String columna);
    Asiento buscarAsientoPorId(Integer id);
    boolean verDisponibilidadAsiento();
    Asiento editarDisponibilidad(Integer id);
    void eliminarAsiento(Integer id);
}
