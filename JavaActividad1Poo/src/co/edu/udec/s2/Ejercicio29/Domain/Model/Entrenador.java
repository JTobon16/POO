
package co.edu.udec.s2.Ejercicio29.Domain.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author altoc
 */

public class Entrenador {
    private String nombre;
    private String experiencia;
    private int añosExperiencia;
    private List<Rutina> rutinas; 
    private Gimnasio gimnasio; 

    public Entrenador(String nombre, String experiencia, int añosExperiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.añosExperiencia = añosExperiencia;
        this.rutinas = new ArrayList<>();
    }

    public void agregarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public List<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(List<Rutina> rutinas) {
        this.rutinas = rutinas;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }
    public String toString() {
        return "Entrenador: " + nombre + ", Experiencia: " + experiencia + ", Años de experiencia: " + añosExperiencia;
    }

    

    
}