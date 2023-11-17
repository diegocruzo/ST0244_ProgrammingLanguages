-- Currificación (currying)

sumarTresNumeros x y z = x + y + z

sumarYMostrar x y driver = driver (show (x + y))