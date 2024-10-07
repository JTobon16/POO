
package co.edu.udec.s2.Ejercicio29.Domain.Model;

/**
 *
 * @author altoc
 */

public class Ejercicio {
    private String nombre;
    private int repeticiones;
    private int series;
    
    //constructor
    public Ejercicio(String nombre, int repeticiones, int series) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }
    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    
     public String toString() {
        return "Ejercicio: " + nombre + ", Repeticiones: " + repeticiones + ", Series: " + series;
    }
}
