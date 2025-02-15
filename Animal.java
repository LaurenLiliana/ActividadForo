//ABSTRACCION
abstract class Animal {
    // Método abstracto (no tiene implementación)
    abstract void hacerSonido();

    // Método concreto (tiene implementación)
    public void dormir() {
        System.out.println("Zzz... el animal está durmiendo.");
    }
}

// Subclase que implementa el método abstracto
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}

// Otra subclase que implementa el método abstracto
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau miau!");
    }
}

// Clase principal con el método main
 class AbstraccionEjemplo {
    public static void main(String[] args) {
        // Crear objetos de las subclases
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Llamar a los métodos
        perro.hacerSonido();
        perro.dormir();

        gato.hacerSonido();
        gato.dormir();
    }
}

