public class Polimorfismo {
    public static void main(String[] args) {
        Perro brandon = new Perro("Brandon");
        Vaca lola = new Vaca("Lola");
        Pato lucas = new Pato("Lucas");

        System.out.println("Expresión de los animales: ");
        System.out.println(brandon.getNombre() + ": " + brandon.getExpresion());
        System.out.println(lola.getNombre() + ": " + lola.getExpresion());
        System.out.println(lucas.getNombre() + ": " + lucas.getExpresion());
    }
}
