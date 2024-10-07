function main() {
    console.log("CÓDIGO: 7502410011");
    console.log("JONATHAN ALFONSO TOBON CELEMIN");
    console.log("*******************************");

    const gimnasio = new Gimnasio("Fitness Tobon Center", "Barrio Torices", "30");

    // Crear usuario
    const usuario1 = new Usuario(1, "Alexis", "3155696489", 17);
    const rutina1 = new Rutina("Rutina de Fuerza", 60, 3);
    rutina1.agregarEjercicio(new Ejercicio("Press de banca", 10, 3));
    rutina1.agregarEjercicio(new Ejercicio("Sentadillas", 12, 4));
    usuario1.agregarRutina(rutina1);
    gimnasio.agregarUsuario(usuario1);

    // Crear segundo usuario
    const usuario2 = new Usuario(2, "Billy", "3204697318", 19);
    const rutina2 = new Rutina("Rutina de Cardio", 45, 2);
    rutina2.agregarEjercicio(new Ejercicio("Correr", 20, 1));
    rutina2.agregarEjercicio(new Ejercicio("Bicicleta", 30, 1));
    usuario2.agregarRutina(rutina2);
    gimnasio.agregarUsuario(usuario2);

    // Crear entrenador del gimnasio
    const entrenador = new Entrenador("Octavio", "Experto en Fuerza", 5);
    entrenador.agregarRutina(rutina1);
    entrenador.agregarRutina(rutina2);
    gimnasio.entrenador = entrenador;

    // Mostrar gimnasio, usuarios y rutinas
    console.log(gimnasio.toString());
    gimnasio.usuarios.forEach(usuario => {
        console.log(usuario.toString());
    });
}


main();
