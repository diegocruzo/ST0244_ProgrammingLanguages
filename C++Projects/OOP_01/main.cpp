#include <iostream>
using namespace std;

class Automovil{        // clase Automovil
private:                 // Especificador de acceso
    string marca;       // atributo propio de la clase
    string modelo;      // atributo propio de la clase
    string color;       // atributo propio de la clase
    int caballosMotor;  // atributo propio de la clase

public:
    // Setter y Getter para encapsulamiento
    const string &getMarca() const {
        return marca;
    }

    void setMarca(const string &marca) {
        Automovil::marca = marca;
    }

    const string &getModelo() const {
        return modelo;
    }

    void setModelo(const string &modelo) {
        Automovil::modelo = modelo;
    }

    const string &getColor() const {
        return color;
    }

    void setColor(const string &color) {
        Automovil::color = color;
    }

    int getCaballosMotor() const {
        return caballosMotor;
    }

    void setCaballosMotor(int caballosMotor) {
        Automovil::caballosMotor = caballosMotor;
    }

    // Constructor de la clase
    Automovil(string mar, string mod, string col){
        marca = mar;
        modelo = mod;
        color = col;
    }

    // Constructor de la clase: sobrecarga de mètodos
    Automovil(int caballosDeFuerza){
        caballosMotor = caballosDeFuerza;
        cout << "Se creó un automóvil con " << caballosMotor << " caballos de fuerza.\n";
    }
    // Construir y definir un método dentro de la clase
    void arrancar(){
        cout << "El vehículo arrancó.\n";
    }

    // Construir un método dentro de una clase
    void acelerar();
    void acelerar(int km);
};

// Definir el método acelerar fuera de la clase Automovil
void Automovil::acelerar() {
    cout << "El vehículo está acelerando.\n";
}

// Definir un método para sobrecarga de métodos
void Automovil::acelerar(int km) {
    cout << "El vehículo está acelerando a " << km << " km por hora.\n";
}

// Ejecutar el programa principal
int main() {
    Automovil carrito("Ferrari", "2017", "Rojo"); // Crear la instancia de la clase automóvil
    cout << "Marca de carrito: " + carrito.getMarca();
    cout << "\nModelo de carrito: " + carrito.getModelo();
    cout << "\nColor de carrito: " + carrito.getColor();
    cout << "\n";

    Automovil carrito2(20000);
    carrito2.acelerar();
    carrito2.acelerar(60);
    return 0;
}
