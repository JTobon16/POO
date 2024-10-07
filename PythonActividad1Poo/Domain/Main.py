from PythonActividad1Poo.Domain.Gimnasio_model import Gimnasio
from PythonActividad1Poo.Domain.Usuario_model import Usuario
from PythonActividad1Poo.Domain.Rutina_model import Rutina
from PythonActividad1Poo.Domain.Ejercicio_model import Ejercicio
from PythonActividad1Poo.Domain.Entrenador_model import Entrenador

if __name__ == "__main__":
    print("CÓDIGO: 7502410011")
    print("JONATHAN ALFONSO TOBON CELEMIN")
    print("*******************************")
    
    gimnasio = Gimnasio("Fitness Tobon Center", "Barrio Torices", "30")

    # Crea un usuario
    usuario1 = Usuario(1, "Alexis", "3155696489", 17)
    rutina1 = Rutina("Rutina de Fuerza", 60, 3)
    rutina1.agregar_ejercicio(Ejercicio("Press de banca", 10, 3))
    rutina1.agregar_ejercicio(Ejercicio("Sentadillas", 12, 4))
    usuario1.agregar_rutina(rutina1)
    gimnasio.agregar_usuario(usuario1)

    # Crea el segundo usuario
    usuario2 = Usuario(2, "Billy", "3204697318", 19)
    rutina2 = Rutina("Rutina de Cardio", 45, 2)
    rutina2.agregar_ejercicio(Ejercicio("Correr", 20, 1))
    rutina2.agregar_ejercicio(Ejercicio("Bicicleta", 30, 1))
    usuario2.agregar_rutina(rutina2)
    gimnasio.agregar_usuario(usuario2)

    # Crea el entrenador del gimnasio
    entrenador = Entrenador("Octavio", "Experto en Fuerza", 5)
    gimnasio.set_entrenador(entrenador)
    entrenador.agregar_rutina(rutina1)
    entrenador.agregar_rutina(rutina2)

    # Muestra el gimnasio, usuario y rutina
    print(gimnasio)
    for usuario in gimnasio.get_usuarios():
        print(usuario)
