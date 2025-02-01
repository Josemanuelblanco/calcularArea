package figuras;

/**
 * Clase Test:para probar la clase Circunferencia.
 */
public class Test {
    public static void main(String[] args) {
        // Crear dos instancias de Circunferencia
        Circunferencia c1 = new Circunferencia(5.0);
        Circunferencia c2 = new Circunferencia(5.0);

        // Cambiar el color de la primera circunferencia
        c1.setColor("azul");

        // Imprimir propiedades de ambas circunferencias
        System.out.println("Propiedades de la primera circunferencia:");
        c1.imprimir();

        System.out.println("\nPropiedades de la segunda circunferencia:");
        c2.imprimir();

        // Comparar circunferencias considerando los decimales
        boolean iguales = c1.esIgual(true, c2);
        System.out.println("\n¿Son iguales considerando decimales? " + iguales);

        // Comparar circunferencias ignorando los decimales
        iguales = c1.esIgual(false, c2);
        System.out.println("¿Son iguales ignorando decimales? " + iguales);
    }
}
