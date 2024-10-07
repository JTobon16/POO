class Rutina {
    constructor(nombre, duracion, nivel) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
        this.ejercicios = [];
    }

    agregarEjercicio(ejercicio) {
        this.ejercicios.push(ejercicio);
    }

    toString() {
        let result = `Rutina: ${this.nombre}, Duración: ${this.duracion} minutos, Nivel: ${this.nivel}. `;
        this.ejercicios.forEach(ejercicio => {
            result += ejercicio.toString() + " ";
        });
        return result.trim();
    }
}