
package co.edu.udec.s2.Ejercicio29.Domain.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author altoc
 */
public class Gimnasio {
    private String nombre;
    private String ubicacion;
    private String numeroMaquinas;
    private Entrenador entrenador;
    private List<Usuario> usuarios;
    
    //constructor
public Gimnasio(String nombre, String ubicacion, String numeroMaquinas){
   this.nombre = nombre;
   this.ubicacion = ubicacion;
   this.numeroMaquinas = numeroMaquinas;
   this.usuarios = new ArrayList<>();
   
   }
    //metodo
public void agregarUsuario(Usuario usuario){
   usuarios.add(usuario);
}
    //setters and getters
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getUbicacion(){
    return ubicacion;
}
public void setUbicacion(String ubicacion){
    this.ubicacion = ubicacion;
}

public String getNumeroMaquina(){
    return numeroMaquinas;
}
public void setNumeroMaquinas(String numeroMaquinas){
    this.numeroMaquinas = numeroMaquinas;
}

public Entrenador getEntrenador(){
    return entrenador;
}
public void setEntrenador(Entrenador entrenador){
    this.entrenador = entrenador;
}

public List<Usuario> getUsuarios(){
    return usuarios;
}
public void setUsuaios(List<Usuario> usuarios){
    this.usuarios = usuarios;
}
 public String toString() {
    String result = "Gimnasio: " + nombre + ", Ubicación: " + ubicacion + ", Máquinas: " + numeroMaquinas;
    result += "\nEntrenador: " + (entrenador != null ? entrenador.toString() : "N/A");
    return result;
}
}

