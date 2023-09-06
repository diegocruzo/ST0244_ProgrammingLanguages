#include <iostream>
using namespace std;

class Pato{
private:
    string caracteristicaPato = "¡Tengo pico de pato!\n";
public :
    void caracteristicaP(){
        cout << this->caracteristicaPato;
    }
};

class Castor{
private:
    string caracteristicaCastor = "¡Tengo cola de castor!\n";
public :
    void caracteristicaC(){
        cout << this->caracteristicaCastor;
    }
};

class Ornitorrinco : public Pato, public Castor{
public:
    Ornitorrinco(){
        cout << "Hola, soy Perry.\n";
    }
};

int main() {
    Ornitorrinco perry;
    perry.caracteristicaP();
    perry.caracteristicaC();
    return 0;
}
