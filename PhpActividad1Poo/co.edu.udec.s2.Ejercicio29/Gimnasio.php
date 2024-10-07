<?php
class Gimnasio {
    private $nombre;
    private $ubicacion;
    private $numeroMaquinas;
    private $entrenador;
    private $usuarios = [];

    public function __construct($nombre, $ubicacion, $numeroMaquinas) {
        $this->nombre = $nombre;
        $this->ubicacion = $ubicacion;
        $this->numeroMaquinas = $numeroMaquinas;
    }

    public function agregarUsuario(Usuario $usuario) {
        $this->usuarios[] = $usuario;
    }

    public function setEntrenador(Entrenador $entrenador) {
        $this->entrenador = $entrenador;
    }

    public function getUsuarios() {
        return $this->usuarios;
    }

    public function __toString() {
        $result = "Gimnasio: $this->nombre, Ubicación: $this->ubicacion, Máquinas: $this->numeroMaquinas";
        $result .= "\nEntrenador: " . ($this->entrenador ? $this->entrenador : "N/A");
        return $result;
    }
}

