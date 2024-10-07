
package co.edu.udec.s2.Ejercicio29;

import co.edu.udec.s2.Ejercicio29.Domain.Model.Ejercicio;
import co.edu.udec.s2.Ejercicio29.Domain.Model.Entrenador;
import co.edu.udec.s2.Ejercicio29.Domain.Model.Gimnasio;
import co.edu.udec.s2.Ejercicio29.Domain.Model.Rutina;
import co.edu.udec.s2.Ejercicio29.Domain.Model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author altoc
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CÓDIGO: 7502410011");
        System.out.println("JONATHAN ALFONSO TOBON CELEMIN");
        System.out.println("*******************************");
    
 
        Gimnasio gimnasio = new Gimnasio("Fitness Tobon Center", "Barrio Torices", "30");

        // cree un usuario
        Usuario usuario1 = new Usuario(1, "Alexis", "3155696489", 17);
        Rutina rutina1 = new Rutina("Rutina de Fuerza", 60, 3);
        rutina1.agregarEjercicio(new Ejercicio("Press de banca", 10, 3));
        rutina1.agregarEjercicio(new Ejercicio("Sentadillas", 12, 4));
        usuario1.agregarRutina(rutina1);
        gimnasio.agregarUsuario(usuario1);
        
        // cree el segundo usuario
        Usuario usuario2 = new Usuario(2, "Billy", "3204697318", 19);
        Rutina rutina2 = new Rutina("Rutina de Cardio", 45, 2);
        rutina2.agregarEjercicio(new Ejercicio("Correr", 20, 1));
        rutina2.agregarEjercicio(new Ejercicio("Bicicleta", 30, 1));
        usuario2.agregarRutina(rutina2);
        gimnasio.agregarUsuario(usuario2);

        // cree el entrenador del gimnasio
        Entrenador entrenador = new Entrenador("Octavio", "Experto en Fuerza", 5);
        gimnasio.setEntrenador(entrenador);
        entrenador.agregarRutina(rutina1);
        entrenador.agregarRutina(rutina2);

        // codigo que me muestre el gimnasio usuario y rutina 
        System.out.println(gimnasio);
        for (Usuario usuario : gimnasio.getUsuarios()) {
            System.out.println(usuario);
        }
    }
    
}