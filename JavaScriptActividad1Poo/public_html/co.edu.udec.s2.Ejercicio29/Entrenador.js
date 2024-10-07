class Entrenador {
    constructor(nombre, experiencia, añosExperiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.añosExperiencia = añosExperiencia;
        this.rutinas = [];
    }

    agregarRutina(rutina) {
        this.rutinas.push(rutina);
    }

    toString() {
        return `Entrenador: ${this.nombre}, Experiencia: ${this.experiencia}, Años de experiencia: ${this.añosExperiencia}`;
    }
}
