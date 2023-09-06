import java.beans.Expression;

public class Animal {
    private String nombre, expresion;
    // Constructor
    public Animal(String nombre, String expresion){
        this.nombre = nombre;
        this.expresion = expresion;
    }

    // Setter y Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
}
