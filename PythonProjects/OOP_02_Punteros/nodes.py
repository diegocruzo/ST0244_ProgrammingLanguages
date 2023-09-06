class node:
    def __init__(self, data, next = None):
        self.data = str(data) # Dato asignado al nodo
        self._next = next # Puntero (apuntador) hacia el siguiente elemento

    def __str__(self):
        return self.data
