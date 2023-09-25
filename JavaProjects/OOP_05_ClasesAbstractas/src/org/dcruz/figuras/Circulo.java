package org.dcruz.figuras;

import org.dcruz.figuraGeometrica.FiguraGeometrica;
public class Circulo extends FiguraGeometrica{

    private float radio;
    private static float pi = 3.1416f;
    public Circulo(String tipoFigura, float radio) {
        super(tipoFigura);
        this.radio = radio;
    }

    @Override
    public void area() {
        System.out.println((pi * radio * radio)
                            + " unidades cuadradas.");
    }

    @Override
    public void perimetro() {
        System.out.println(2 * pi * radio
                            + " unidades.");
    }
}
