<?php
class Rutina {
    private $nombre;
    private $duracion;
    private $nivel;
    private $ejercicios = [];

    public function __construct($nombre, $duracion, $nivel) {
        $this->nombre = $nombre;
        $this->duracion = $duracion;
        $this->nivel = $nivel;
    }

    public function agregarEjercicio(Ejercicio $ejercicio) {
        $this->ejercicios[] = $ejercicio;
    }

    public function __toString() {
        $result = "Rutina: $this->nombre, Duración: $this->duracion minutos, Nivel: $this->nivel.";
        foreach ($this->ejercicios as $ejercicio) {
            $result .= " " . $ejercicio;
        }
        return $result;
    }
}

