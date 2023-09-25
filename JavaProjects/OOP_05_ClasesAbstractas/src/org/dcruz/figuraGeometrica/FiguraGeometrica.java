package org.dcruz.figuraGeometrica;

abstract public class FiguraGeometrica {
    protected String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    abstract public void area();
    abstract public void perimetro();
}
