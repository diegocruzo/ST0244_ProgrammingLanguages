package org.dcruz.figuras;

import org.dcruz.figuraGeometrica.FiguraGeometrica;
public class Cuadrado extends FiguraGeometrica {
    private int lado;
    public Cuadrado(String tipoFigura, int lado) {
        super(tipoFigura);
        this.lado = lado;
    }

    @Override
    public void area() {
        System.out.println("El área del " + this.tipoFigura
                            + " es: " + (lado * lado)
                            + " unidades cuadradas.");
    }

    @Override
    public void perimetro() {
        System.out.println("El perímetro del " + this.tipoFigura
                            + " es: " + (lado * 4)
                            + " unidades.");
    }
}
