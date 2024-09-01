
package Persistencia;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JOSUE GOMEZ
 */
public class Tarea {
   private String nombre;
   private Date fecha;

    public Tarea(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
 
}
