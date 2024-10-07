class Gimnasio:
    def __init__(self, nombre, ubicacion, numero_maquinas):
        self.nombre = nombre
        self.ubicacion = ubicacion
        self.numero_maquinas = numero_maquinas
        self.usuarios = []

    def agregar_usuario(self, usuario):
        self.usuarios.append(usuario)

    def set_entrenador(self, entrenador):
        self.entrenador = entrenador

    def get_usuarios(self):
        return self.usuarios

    def __str__(self):
        return f"Gimnasio: {self.nombre}, Ubicación: {self.ubicacion}, Máquinas: {self.numero_maquinas}, Entrenador: {getattr(self, 'entrenador', 'N/A')}"