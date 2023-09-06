// Abstracción: Capacidad de crear una clase o un tipo de dato nuevo
public class Automovil {
    // Propiedades
    private static String marca, modelo, color;
    private static int caballosMotor;

    // Métodos
    // Constructor de la clase
    public Automovil(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    public Automovil(String marca, String color){
        this.marca = marca;
        this.modelo = "2023";
        this.color = color;
    }
    public Automovil(int caballosMotor){
        System.out.println("Se creó un vehículo con " + caballosMotor + " caballos de fuerza");
    }
    void arrancar(){
        System.out.println("El vehículo se encendió");
    }

    void acelerar(){
        System.out.println("El vehículo está acelerando");
    }

    void acelerar(int km){
        System.out.println("El vehículo está acelerando a " +
                            km + " por hora");
    }
    void frenar(){
        System.out.println("El vehículo se detuvo");
    }

}




