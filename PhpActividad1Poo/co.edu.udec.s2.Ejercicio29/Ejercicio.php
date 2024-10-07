<?php
class Ejercicio {
    private $nombre;
    private $repeticiones;
    private $series;

    public function __construct($nombre, $repeticiones, $series) {
        $this->nombre = $nombre;
        $this->repeticiones = $repeticiones;
        $this->series = $series;
    }

    public function __toString() {
        return "Ejercicio: $this->nombre, Repeticiones: $this->repeticiones, Series: $this->series";
    }
}

