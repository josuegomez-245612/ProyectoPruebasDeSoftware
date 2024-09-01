
package Persistencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JOSUE GOMEZ
 */
public class TareaDAOImpl implements TareaDAO{
 private final List<Tarea> tareas = new ArrayList<>();
 Date fecha = new Date(124,8,2);
 Tarea t = new Tarea("Limpiar la casa",fecha);
 
 
    @Override
    public void crearTarea(Tarea tarea) {
      
        tareas.add(t);
        tareas.add(tarea);
    }

    @Override
    public Tarea obtenerTareaPorNombre(String nombre) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombre)) {
                return tarea;
            }
        }
        return null; 
    }

    @Override
    public List<Tarea> obtenerTodasLasTareas() {
         tareas.add(t);
        return new ArrayList<>(tareas); 
    }

    @Override
    public void actualizarTarea(Tarea tarea) {
        Tarea tareaExistente = obtenerTareaPorNombre(tarea.getNombre());
        if (tareaExistente != null) {
            tareaExistente.setFecha(tarea.getFecha());
        }
    }

    @Override
    public void eliminarTarea(String nombre) {
        Tarea tarea = obtenerTareaPorNombre(nombre);
        if (tarea != null) {
            tareas.remove(tarea);
        }
    }
    
}
