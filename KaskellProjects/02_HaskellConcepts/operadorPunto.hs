duplicarLista = map (* 2)

filtrarParesLista = filter (\x -> mod x 2 == 0)

incrementarLista = map succ

combinar = incrementarLista .
    duplicarLista .
    filtrarParesLista


crearLista x y =
    if x == 0
        then y
    else
        crearLista (x - 1) ((x-1):y)

solicitarLista x = x []

-- Crear una lista con un solo parámetro para que el usuario no tenga que llamar la función haciendo uso de dos parámetros
combinar2 = solicitarLista . crearLista

-- La misma operación anterior puede llevarse a cabo con funciones oprimizadas para no tener que llamar dos parámetros al ajecutar la función