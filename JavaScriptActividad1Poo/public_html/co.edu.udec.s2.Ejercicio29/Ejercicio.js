class Ejercicio {
    constructor(nombre, repeticiones, series) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    toString() {
        return `Ejercicio: ${this.nombre}, Repeticiones: ${this.repeticiones}, Series: ${this.series}`;
    }
}