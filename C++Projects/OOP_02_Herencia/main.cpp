#include <iostream>
using namespace std;

class Ave {
protected:
    string colorPlumas, raza;
    float medida;
public:
    // Constructor
    Ave(const string color, float medida, const string raza){
        this->colorPlumas = color;
        this->medida = medida;
        this->raza = raza;
    }

    // Métodos
    void ponerHuevos() {
        cout << "¡He puesto un huevo!\n";
    }
    // Sobrecarga de métodos
    void ponerHuevos(int cantidad){
        cout << "¡He puesto " << cantidad << " huevos!\n";
    }
    // Setter y Getter
    const string &getColorPlumas() const {
        return colorPlumas;
    }

    void setColorPlumas(const string &colorPlumas) {
        Ave::colorPlumas = colorPlumas;
    }

    const string &getRaza() const {
        return raza;
    }

    void setRaza(const string &raza) {
        Ave::raza = raza;
    }

    float getMedida() const {
        return medida;
    }

    void setMedida(float medida) {
        Ave::medida = medida;
    }
};

// Crear una clase que hereda de otra
class Pato : public Ave {
private:
    string nombre;
public:
    // Constructor de la clase, hereda de la superclase
    Pato(const string color1, float medida1, const string raza1) : Ave(color1, medida1, raza1) {
        this->colorPlumas = color1;
        this->medida = medida1;
        this->raza = raza1;
    }

    // Setter y Getter
    const string &getNombre() const {
        return nombre;
    }

    void setNombre(const string &nombre) {
        Pato::nombre = nombre;
    }

    // Métodos
    void volar() {
        cout << "¡Estoy volando!\n";
    }
    void volar(int km) {
        cout << "¡Estoy volando a " << km << " km por hora!\n";
    }


};




int main() {
    // Crear la instancia de la clase Ave
    Ave josefina("Blanco", 15, "Gallina");
    josefina.ponerHuevos();
    josefina.ponerHuevos(3);
    cout << "Raza de Josefina: " << josefina.getRaza() << "\n";

    Pato lucas("Negro", 25, "Pato");
    lucas.setNombre("Lucas");

    cout << "El pato se llama " << lucas.getNombre() << "\n";
    lucas.ponerHuevos();
    lucas.volar(40);
}
