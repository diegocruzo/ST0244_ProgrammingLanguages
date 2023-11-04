crearLista x y =
    if x == 0
        then y
    else
        crearLista (x - 1) ((x-1):y)

crearListaOpt x y =
    if x == 0
        then y
    else crearListaOpt z (z:y)
        where z = x - 1