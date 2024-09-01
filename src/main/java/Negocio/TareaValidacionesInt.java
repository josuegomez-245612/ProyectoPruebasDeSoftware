/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Negocio;

import Persistencia.Tarea;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JOSUE GOMEZ
 */
public interface TareaValidacionesInt {
     void agregarTarea(String nombre, Date fecha);
    Tarea obtenerTareaPorNombre(String nombre);
    List<Tarea> obtenerTodasLasTareas();
    void actualizarTarea(String nombre, Date nuevaFecha);
    void eliminarTarea(String nombre);
}
