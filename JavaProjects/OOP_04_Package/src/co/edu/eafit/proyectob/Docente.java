package co.edu.eafit.proyectob;

import co.edu.eafit.proyectoa.Persona;
public class Docente extends Persona{
    private int horas;
    // Constructor
    public Docente(String nom, String tipoId, String numId, int horas) {
        super(nom, tipoId, numId);
        this.horas = horas;
    }

    // Métodos
    public void DarClase(int cantidadCursos){
        System.out.println("Doy clase en "
                + cantidadCursos + " cursos.");
    }


    // Getter y Setter
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
