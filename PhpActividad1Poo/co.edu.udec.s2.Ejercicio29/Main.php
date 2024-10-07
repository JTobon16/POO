<?php
require 'Gimnasio.php';
require 'Usuario.php';
require 'Entrenador.php';
require 'Rutina.php';
require 'Ejercicio.php';

echo "CÓDIGO: 7502410011\n";
echo "JONATHAN ALFONSO TOBON CELEMIN\n";
echo "*******************************\n";

$gimnasio = new Gimnasio("Fitness Tobon Center", "Barrio Torices", "30");

// Crear un usuario
$usuario1 = new Usuario(1, "Alexis", "3155696489", 17);
$rutina1 = new Rutina("Rutina de Fuerza", 60, 3);
$rutina1->agregarEjercicio(new Ejercicio("Press de banca", 10, 3));
$rutina1->agregarEjercicio(new Ejercicio("Sentadillas", 12, 4));
$usuario1->agregarRutina($rutina1);
$gimnasio->agregarUsuario($usuario1);

// Crear el segundo usuario
$usuario2 = new Usuario(2, "Billy", "3204697318", 19);
$rutina2 = new Rutina("Rutina de Cardio", 45, 2);
$rutina2->agregarEjercicio(new Ejercicio("Correr", 20, 1));
$rutina2->agregarEjercicio(new Ejercicio("Bicicleta", 30, 1));
$usuario2->agregarRutina($rutina2);
$gimnasio->agregarUsuario($usuario2);

// Crear el entrenador del gimnasio
$entrenador = new Entrenador("Octavio", "Experto en Fuerza", 5);
$gimnasio->setEntrenador($entrenador);
$entrenador->agregarRutina($rutina1);
$entrenador->agregarRutina($rutina2);

// Mostrar el gimnasio, usuarios y rutinas
echo $gimnasio;
foreach ($gimnasio->getUsuarios() as $usuario) {
    echo "\n" . $usuario;
}

