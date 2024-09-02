/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Persistencia.Tarea;
import Persistencia.TareaDAO;
import Persistencia.TareaDAOImpl;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JOSUE GOMEZ
 */
public class TareaValidaciones implements TareaValidacionesInt {
   private final TareaDAO tareaDAO = new TareaDAOImpl(); 

    @Override
    public void agregarTarea(String nombre, Date fecha) {
        if (tareaDAO.obtenerTareaPorNombre(nombre) == null) {
            Tarea nuevaTarea = new Tarea(nombre, fecha);
            tareaDAO.crearTarea(nuevaTarea);
        } else {
            throw new IllegalArgumentException("La tarea con ese nombre ya existe.");
        }
    }

    @Override
    public Tarea obtenerTareaPorNombre(String nombre) {
        return tareaDAO.obtenerTareaPorNombre(nombre);
    }

    @Override
    public List<Tarea> obtenerTodasLasTareas() {
        return tareaDAO.obtenerTodasLasTareas();
    }

    @Override
    public void actualizarTarea(String nombre, Date nuevaFecha) {
        Tarea tarea = tareaDAO.obtenerTareaPorNombre(nombre);
        if (tarea != null) {
            tarea.setFecha(nuevaFecha);
            tareaDAO.actualizarTarea(tarea);
        } else {
            throw new IllegalArgumentException("No se encontró una tarea con ese nombre.");
        }
    }

    @Override
    public void eliminarTarea(String nombre) {
        Tarea tarea = tareaDAO.obtenerTareaPorNombre(nombre);
        if (tarea != null) {
            tareaDAO.eliminarTarea(nombre);
        } else {
            throw new IllegalArgumentException("No se encontró una tarea con ese nombre.");
        }
    }

    @Override
    public void editarTarea(String nombre, String nuevoNombre, Date nuevaFecha) {
        Tarea tarea = tareaDAO.obtenerTareaPorNombre(nombre);
        tarea.setNombre(nuevoNombre);
        tarea.setFecha(nuevaFecha);
        tareaDAO.editarTarea(tarea);
    }

   
    
    
    
}