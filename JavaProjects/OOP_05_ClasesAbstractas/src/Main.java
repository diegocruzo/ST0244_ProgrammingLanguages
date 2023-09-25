import org.dcruz.figuras.*;
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("cuadrado", 2);
        Circulo circulo = new Circulo("círculo", 3.2f);
        System.out.println("Cuadrado: ");
        cuadrado.area();
        cuadrado.perimetro();
        System.out.println("\nCírculo: ");
        circulo.area();
        circulo.perimetro();


    }
}
