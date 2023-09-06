public class Ave {
    private static String colorPlumas, raza;
    private static double medida;

    public Ave(String color, double medida, String raza){
        this.colorPlumas = color;
        this.medida = medida;
        this.raza = raza;
    }

    public Ave(String color, double medida) {
        this.colorPlumas = color;
        this.medida = medida;
        this.raza = "Sin definir";
    }

    // Setter y Getter
    public static String getColorPlumas() {
        return colorPlumas;
    }

    public static void setColorPlumas(String colorPlumas) {
        Ave.colorPlumas = colorPlumas;
    }

    public static String getRaza() {
        return raza;
    }

    public static void setRaza(String raza) {
        Ave.raza = raza;
    }

    public static double getMedida() {
        return medida;
    }

    public static void setMedida(double medida) {
        Ave.medida = medida;
    }

    // Métodos
    public void ponerHuevos(){
        System.out.println("¡He puesto un huevo!");
    }
    public void ponerHuevos(int cantidad){
        System.out.println("¡He puesto " + cantidad + " huevos!");
    }
}
