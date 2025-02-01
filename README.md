package figuras;

/**
 * Representa una circunferencia con un radio y un color.
 */
public class Circunferencia {
    private double radio;
    private String color = "rojo";

    /**
     * Obtiene el radio de la circunferencia.
     * @return el radio de la circunferencia.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio de la circunferencia.
     * @param radio el nuevo valor del radio.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Constructor que inicializa la circunferencia con un radio específico.
     * @param radio el radio de la circunferencia.
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Imprime el diámetro, color y área de la circunferencia.
     */
    public void imprimir() {
        System.out.println("Diámetro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * Compara esta circunferencia con otra para determinar si son iguales.
     * @param otro la otra circunferencia con la que se compara.
     * @param considerarDecimales indica si la comparación debe considerar los decimales.
     * @return true si las circunferencias son iguales según el criterio especificado, false en caso contrario.
     */
    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            return radio1 == radio2;
        } else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }
}

package figuras;

/**
 * Clase de prueba para la clase Circunferencia.
 */
public class Test {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);
        
        /**
         * Se crean condicionales para comprobar si aplica correctamente el método esIgual.
         */
        if (c2.esIgual(c3, false)) {
            System.out.println("c2 y c3: iguales sin considerar decimales");
        }
        
        if (c2.esIgual(c3, true)) {
            System.out.println("c2 y c3: iguales considerando decimales");
        }
        
        c1.imprimir();
    }
}
