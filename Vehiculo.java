// Clase base
class VehiculoBase {
    void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clases derivadas con polimorfismo
class Coche extends VehiculoBase {
    void moverse() {
        System.out.println("El coche está conduciendo por la carretera.");
    }
}

class Moto extends VehiculoBase {
    void moverse() {
        System.out.println("La moto está acelerando en la autopista.");
    }
}

// Clase principal
public class Vehiculo {
    public static void main(String[] args) {
        VehiculoBase miVehiculo1 = new Coche();
        VehiculoBase miVehiculo2 = new Moto();

        miVehiculo1.moverse(); // Llamará al método de Coche
        miVehiculo2.moverse(); // Llamará al método de Moto
    }
}


