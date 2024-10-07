<?php
class Usuario {
    private $id;
    private $nombre;
    private $telefono;
    private $edad;
    private $rutinas = [];

    public function __construct($id, $nombre, $telefono, $edad) {
        $this->id = $id;
        $this->nombre = $nombre;
        $this->telefono = $telefono;
        $this->edad = $edad;
    }

    public function agregarRutina(Rutina $rutina) {
        $this->rutinas[] = $rutina;
    }

    public function __toString() {
        $result = "Nombre: $this->nombre, Teléfono: $this->telefono, Edad: $this->edad.";
        foreach ($this->rutinas as $rutina) {
            $result .= " " . $rutina;
        }
        return $result;
    }
}

