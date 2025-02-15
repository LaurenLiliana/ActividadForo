//HERENCIA

// Clase base (superclase)
class Herencia {
    String nombre;
    
    Herencia(String nombre) {
        this.nombre = nombre;
    }

    void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}

// Clase derivada (subclase)
class Gerente extends Herencia {
    Gerente(String nombre) {
        super(nombre);
    }

    void dirigir() {
        System.out.println(nombre + " está dirigiendo el equipo.");
    }
}

// Clase principal
public class Empleado {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos");
        gerente.trabajar(); // Heredado de Empleado
        gerente.dirigir();  // Método propio de Gerente
    }
}
