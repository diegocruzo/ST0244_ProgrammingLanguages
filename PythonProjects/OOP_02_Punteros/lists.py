from nodes import node

class SinglyLinkedList:

    # Constructor
    def __init__(self):
        self.first = None # Puntero hacia el primer elemento de la lista
        self.last = None # Puntero hacia el último elemento de la lista
        self.size = 0 # Cantidad de elementos de la lista

    # Operación para verificar si la lista está vacía
    def Empty(self):
        return self.first == None

    # Operación para insertar elementos al inicio de la lista
    def InsertFirst(self, data):
        # Asignar memoria y rellenar el campo de datos
        newNode = node(data)
        # Verificar si la lista está vacía
        if self.Empty():
            # Operación para insertar un elemento en una lista vacía
            self.first = self.last = newNode
        else:
            # Operación para insertar un elemento al inicio de la lista
            # Paso 3 del algoritmo: Se mueve el puntero del nuevo nodo
            newNode._next = self.first
            # Paso 4 el algoritmo: Se mueve el puntero inicio
            self.first = newNode
        # Actualizar el tamaño de la lista
        self.size += 1

    # Operación para mostrar los elementos de la lista
    def Show(self):
        aux = self.first
        while aux:
            print(aux, end=" ")
            aux = aux._next
        print("")