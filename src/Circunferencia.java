package figuras;

/**
 * Clase que representa una circunferencia y permite calcular su área y diámetro.
 */
public class Circunferencia {
    private double radio;
    private String color;

    // Constructor
    public Circunferencia(double radio) {
        this.radio = radio;
        this.color = "rojo";
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método para imprimir las propiedades
    public void imprimir() {
        double d = 2 * radio; // Diámetro
        System.out.println("Diámetro: " + d);
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea());
    }

    // Método para calcular el área
    private double calcularArea() {
        final double PI = 3.1416;
        return PI * radio * radio;
    }

    // Método para comparar circunferencias
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        if (considerarDecimales) {
            return this.radio == otro.getRadio();
        } else {
            return Math.abs(this.radio - otro.getRadio()) < 1;
        }
    }
}
