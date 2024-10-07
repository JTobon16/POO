class Usuario {
    constructor(id, nombre, telefono, edad) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.rutinas = [];
    }

    agregarRutina(rutina) {
        this.rutinas.push(rutina);
    }

    toString() {
        let result = `Nombre: ${this.nombre}, Teléfono: ${this.telefono}, Edad: ${this.edad}. `;
        this.rutinas.forEach(rutina => {
            result += rutina.toString() + " ";
        });
        return result.trim();
    }
}