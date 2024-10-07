
package co.edu.udec.s2.Ejercicio29.Domain.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author altoc
 */

public class Usuario {
    private int id;
    private String nombre;
    private String telefono;
    private int edad;
    private List<Rutina> rutinas; 
    private Entrenador entrenador; 
    
    // constructor
    public Usuario(int id, String nombre, String telefono, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.rutinas = new ArrayList<>();
    }

    //metodo
    public void agregarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

     //setters and getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Rutina> getRutinas() {
        return rutinas;
    }
    public void setRutinas(List<Rutina> rutinas) {
        this.rutinas = rutinas;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    
       public String toString() {
        String result = "Nombre: " + nombre + ", Teléfono: " + telefono + ", Edad: " + edad + ". ";
        for (Rutina rutina : rutinas) {
            result += rutina.toString() + " ";
        }
        return result.trim();
    }

    
}