duplicarLista :: [Integer] -> [Integer]
duplicarLista = map (* 2)

filtrarParesLista :: [Integer] -> [Integer]
filtrarParesLista = filter (\x -> (mod x 2) == 0)

incrementarLista :: [Integer] -> [Integer]
incrementarLista = map succ

combinar = incrementarLista .
    duplicarLista .
    filtrarParesLista
