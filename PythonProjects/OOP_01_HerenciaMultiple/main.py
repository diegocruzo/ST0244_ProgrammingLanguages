from animales import Perro, Vaca, Pato, Castor, Ornitorrinco

# Instancias de las clases
brandon = Perro("Brandon")
lola = Vaca("Lola")
lucas = Pato("Lucas")
perry = Ornitorrinco("Perry")
bob = Castor("Bob")

# Polimorfismo
print(brandon.nombre,"dice:",brandon)
print(lola.nombre,"dice:",lola)
print(lucas.nombre,"dice:",lucas)
print(bob.nombre,"dice:",bob)
bob.caracteristicaC()
print(perry)
print("Mi nombre es",perry.nombre)
perry.caracteristicaC()
perry.caracteristicaP()


