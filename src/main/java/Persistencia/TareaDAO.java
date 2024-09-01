/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import java.util.List;

/**
 *
 * @author JOSUE GOMEZ
 */
public interface TareaDAO {
   void crearTarea(Tarea tarea);
    Tarea obtenerTareaPorNombre(String nombre);
    List<Tarea> obtenerTodasLasTareas();
    void actualizarTarea(Tarea tarea);
    void eliminarTarea(String nombre);
}