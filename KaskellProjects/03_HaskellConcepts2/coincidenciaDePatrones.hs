-- Coincidencia de patrones (pattern matching)

imprimirNumeroSuerte 10 = "Valor de la suerte"
imprimirNumeroSuerte 7 = "Otro valor de la suerte"
imprimirNumeroSuerte x = "Sigue intentando"


data Peso = PesoEnKg Float | PesoEnGr Float


mostrarPesoKg (PesoEnGr x) = print (show (x/1000))
mostrarPesoGr (PesoEnGr x) = print (show x)


