<?php
class Entrenador {
    private $nombre;
    private $experiencia;
    private $añosExperiencia;
    private $rutinas = [];

    public function __construct($nombre, $experiencia, $añosExperiencia) {
        $this->nombre = $nombre;
        $this->experiencia = $experiencia;
        $this->añosExperiencia = $añosExperiencia;
    }

    public function agregarRutina(Rutina $rutina) {
        $this->rutinas[] = $rutina;
    }

    public function __toString() {
        return "Entrenador: $this->nombre, Experiencia: $this->experiencia, Años de experiencia: $this->añosExperiencia";
    }
}

