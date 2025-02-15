//Clase abstracta que representa la figura geometrica
abstract class FiguraGeometrica {

    //Atributo privado de encapsulacion
    private String nombre; 

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso (Encapsulación)
    public String getNombre() {
        return nombre;
    }

    // Métodos abstractos  - Las subclases deben implementarlos
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

//Clase que herendan de FiguraGeometrica 
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

//Implementación diferente de calcularArea y calcularPerimetro de Polimorfismo
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo extends FiguraGeometrica {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        super("Rectángulo");
        this.largo = largo;
        this.ancho = ancho;
    }

 //Implementación de calcularArea y calcularPerimetro
    @Override
    double calcularArea() {
        return largo * ancho;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}

//Clase Main
public class FigurasGeometricas {
    public static void main(String[] args) {
        // Creamos un Círculo y un Rectángulo
        FiguraGeometrica miCirculo = new Circulo(5);
        FiguraGeometrica miRectangulo = new Rectangulo(4, 6);

        // Aplicamos polimorfismo: Cada figura calcula su área y perímetro de forma diferente
        System.out.println("Figura: " + miCirculo.getNombre());
        System.out.println("Área: " + miCirculo.calcularArea());
        System.out.println("Perímetro: " + miCirculo.calcularPerimetro());

        System.out.println("\nFigura: " + miRectangulo.getNombre());
        System.out.println("Área: " + miRectangulo.calcularArea());
        System.out.println("Perímetro: " + miRectangulo.calcularPerimetro());
    }
}

