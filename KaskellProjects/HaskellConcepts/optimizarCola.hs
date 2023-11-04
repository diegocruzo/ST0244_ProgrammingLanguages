import Text.XHtml (face)
-- Optimización de una cola

sumaNumeros x = 
    if x == 0
        then 0
    else x + sumaNumeros (x - 1)

sumaNumerosOpt x y =
    if x == 0
        then y
    else sumaNumerosOpt (x - 1) (x + y) 

factorial x =
    if x == 1
        then 1
    else x * factorial (x - 1)

factorialOpt x y =
    if x == 1
        then y
    else factorialOpt (x - 1) (x * y)


