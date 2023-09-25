package co.edu.eafit.proyectoa;

public class Persona {
    private String nombre, tipoIdentificacion, numeroIdentificacion;
    // Constructor
    public Persona (String nom, String tipoId, String numId){
        this.nombre = nom;
        this.tipoIdentificacion = tipoId;
        this.numeroIdentificacion = numId;
    }

    // Método saludar
    public String Saludar(){
        return "Hola, ¡Soy una persona!";
    }



    // Setter and Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
}
