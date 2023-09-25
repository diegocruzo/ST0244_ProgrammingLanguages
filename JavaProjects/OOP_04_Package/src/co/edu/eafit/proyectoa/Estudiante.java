package co.edu.eafit.proyectoa;

public class Estudiante extends Persona {
    private String programaAcademico;
    // Constructor
    public Estudiante(String nom, String tipoId, String numId, String progAcad) {
        super(nom, tipoId, numId);
        this.programaAcademico = progAcad;
    }

    public static void Saludo(){
        //Saludar();
    }

    // Getter y Setter
    public String getProgramaAcademico() {
        return programaAcademico;
    }
    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
}
