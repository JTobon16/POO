
package co.edu.udec.s2.Ejercicio29.Domain.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author altoc
 */

public class Rutina {
    private String nombre;
    private int duracion;
    private int nivel;
    private List<Ejercicio> ejercicios; 
    
    //constructor
    public Rutina(String nombre, int duracion, int nivel) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.ejercicios = new ArrayList<>();
    }
    //metodo
    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }
    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

   public String toString() {
        String result = "Rutina: " + nombre + ", Duración: " + duracion + " minutos, Nivel: " + nivel + ". ";
        for (Ejercicio ejercicio : ejercicios) {
            result += ejercicio.toString() + " ";
        }
        return result.trim();
    }
}