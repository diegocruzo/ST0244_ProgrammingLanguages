public class Main {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais");
        firulais.expresarse();
        firulais.alimentarse();
        System.out.println(firulais.recorridoEnMetrosPorSegundo());
        firulais.amamantar();

        Gato garfield = new Gato("Garfield");
        garfield.expresarse();
        garfield.alimentarse();
        System.out.println(garfield.recorridoEnMetrosPorSegundo());
        garfield.amamantar();
    }
}
