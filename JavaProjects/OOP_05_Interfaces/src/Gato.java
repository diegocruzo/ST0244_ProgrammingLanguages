public class Gato extends Mamifero implements Animal{

    public Gato(String nombre) {
        super(nombre, "Gato");
    }

    @Override
    public void expresarse() {
        System.out.println("¡Miau!");
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de concentrado.");
    }

    @Override
    public String recorridoEnMetrosPorSegundo() {
        return "¡Corro 5 metros en un segundo!";
    }
}
