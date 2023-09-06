// Herencia: Pato hereda de Ave
public class Pato extends Ave {
    // Características propias de la subclase
    private static String nombre;

    public Pato(String color, double medida, String nombre) {
        super(color, medida);
        this.nombre = nombre;
    }
    // Métodos
    public void volar(){
        System.out.println("¡Estoy volando!");
    }
    public void volar(int km){
        System.out.println("¡Estoy volando a " + km + " km por hora!");
    }

    // Getter y Setter
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Pato.nombre = nombre;
    }
}
