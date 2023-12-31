public class Perro extends Mamifero implements Animal{

    private String color;
    public Perro(String nombre) {
        super(nombre, "Perro");
        this.color = Animal.color;
    }

    @Override
    public void expresarse() {
        System.out.println("¡Guau!");
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de comida que me da la gente");
    }

    @Override
    public String recorridoEnMetrosPorSegundo() {
        return "¡Corro 3 metros en un segundo!";
    }
}
