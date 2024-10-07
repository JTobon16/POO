class Gimnasio {
    constructor(nombre, ubicacion, numeroMaquinas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numeroMaquinas = numeroMaquinas;
        this.usuarios = [];
    }

    agregarUsuario(usuario) {
        this.usuarios.push(usuario);
    }

    toString() {
        let result = `Gimnasio: ${this.nombre}, Ubicación: ${this.ubicacion}, Máquinas: ${this.numeroMaquinas}`;
        return result;
    }
}