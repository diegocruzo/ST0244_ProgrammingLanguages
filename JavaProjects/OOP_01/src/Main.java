import javax.swing.table.AbstractTableModel;

public class Main {
    public static void main(String[] args) {

        // Herencia: Creación de una instancia u objeto de la clase Automovil
        Automovil carrito = new Automovil("Ford", "2020", "Rojo");
        Automovil carrito2 = new Automovil("Mazda", "Negro");

        // Realizar acciones con el objeto
        System.out.println("Carrito:");
        carrito.arrancar();
        carrito.acelerar();
        carrito.frenar();

        // Crear otra instancia de la clase Automovil para verificar
        // la sobrecarga de métodos
        System.out.println("\nCarrito 3");
        Automovil carrito3 = new Automovil(20000);
        carrito3.acelerar(60);
    }
}
