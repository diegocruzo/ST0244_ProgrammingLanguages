package co.edu.eafit;

import co.edu.eafit.proyectoa.Estudiante;

//import static co.edu.eafit.proyectoa.Persona.Saludar;
public class Main {
    public static void main(String[] args) {
        Estudiante juan = new Estudiante("Juan", "NUIP", "123", "Ingeniería de Sistemas");
        co.edu.eafit.proyectob.Docente pedro = new co.edu.eafit.proyectob.Docente("", "CE", "AN345", 12);
        pedro.setNombre("Pedro");
        System.out.println(pedro.Saludar());
        //juan.Saludo();

        //Saludar();
    }
}
