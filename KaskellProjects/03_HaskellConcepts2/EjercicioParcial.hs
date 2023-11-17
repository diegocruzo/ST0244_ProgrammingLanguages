-- Alternativa 1 para identificar a un número primo
identificarNumPrimo2 x y =
    if x < 2
        then False
    else if y == x
        then True
    else if mod x y == 0
        then False
    else
        identificarNumPrimo2 x (y+1)

-- Alternativa 2 para identificar a un número primo
identificarNumPrimo x y
    | x < 2 = False
    | y == x = True
    | mod x y == 0 = False
    | otherwise = identificarNumPrimo x (y+1)

-- Proceso para simplificar el uso de la función para identificar si un número es primo o no
-- Nota: el proceso se puede simplificar a través de la operación punto o de currificación.
isPrime x =
    if identificarNumPrimo x 2 
        then True
    else 
        False

-- Función para generar una lista con dos parámetros
generarLista x y =
    if x < 2
        then y
    else
        generarLista (x-1) (x:y)

oneValue x = x []

-- Simplificación de la generación de una lista ingresando un solo parámetro
-- a través de la operación punto.
listaValores = oneValue . generarLista 

-- Función para filtrar números primos desde una lista pasada como parámetro
filtrarPrimos = filter isPrime

-- Combinación de la función para generar una lista y la función para filtrar
-- los números primos en una lista nueva.
solution = filtrarPrimos . listaValores