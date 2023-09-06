# Clase padre
class Animal:
    # Constructor de la clase
    def __init__(self, nombre, expresion=None):
        self.nombre = nombre
        self.expresion = expresion

    def __str__(self):
        return self.expresion

class Perro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)
        self.expresion = "¡Guau!"

class Vaca(Animal):
    def __init__(self, nombre):
        super().__init__(nombre, "¡Muuu!")

class Pato(Animal):
    def __init__(self, nombre):
        super().__init__(nombre, "¡Cuac!")

    def caracteristicaP(self):
        print("¡Tengo pico de pato!")

class Castor(Animal):
    def __init__(self, nombre):
        super().__init__(nombre, "No sé cómo expresarme.")

    def caracteristicaC(self):
        print("¡Tengo cola de castor!")

class Ornitorrinco(Pato, Castor):
    def __init__(self, nombre):
        self. nombre = nombre

    def __str__(self):
        return "¡Hola, soy un ornitorrinco!"