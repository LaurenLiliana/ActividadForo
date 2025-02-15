//ENCAPSULAMIENTO

public class Persona {
    private String nombre;
    private int edad;

    // Método getter para nombre
    public String getNombre() {
        return this.nombre;
    }

    // Método setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para edad
    public int getEdad() {
        return this.edad;
    }

    // Método setter para edad
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser un valor positivo");
        }
    }
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona1 = new Persona();

        // Establecer el nombre y la edad usando los métodos setter
        persona1.setNombre("Juan Pérez");
        persona1.setEdad(30);

        // Obtener el nombre y la edad y mostrarlos en la consola
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());     
    }
}
