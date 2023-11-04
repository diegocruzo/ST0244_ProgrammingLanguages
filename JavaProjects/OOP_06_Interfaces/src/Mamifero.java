public class Mamifero {
    private String nombre;
    //Constructor de la clase
    public Mamifero(String nombre, String tipoDeAnimal){
        this.nombre = nombre;
        System.out.println("\n\nTipo de animal: " + tipoDeAnimal
                            + "\nNombre del animal: " + nombre + "\n");
    }
    // Método de un mamífero
    public void amamantar(){
        System.out.println("En mis primeros días tomo leche proveniente de mi madre.");
    }
}
