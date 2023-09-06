public class OOP_Herencia {
    public static void main(String[] args) {
        // Crear la instancia de la clase Pato
        Pato lucas = new Pato("Negro", 25, "Lucas");

        lucas.ponerHuevos(3);
        lucas.volar(40);
        System.out.println("Raza del pato Lucas: " + lucas.getRaza());

        Ave josefina = new Ave("Blanco", 10);
        josefina.ponerHuevos();
        System.out.println("Raza de Josefina: " + josefina.getRaza());
        josefina.setRaza("Gallina");
        System.out.println("Raza de Josefina: " + josefina.getRaza());

    }
}
