/*
Ejercicio9: Hacer un programa para calcular el area de poligonos (Triangulos y Rectangulos)
el programa debe ser capaz de almacenar en un arreglo N triangulos y rectanulos, y al final
mostrar el area y los datos cada uno.Para ello se tendra lo siguiente:
    -Una super clase llamada Poligono.
    -Una sub clase llamada Rectangulo.
    -Una sub clase llamada Triangulo.
 */
package ejercicio9;

public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString() + "\nLado1: " + lado1 + ", lado2: " + lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;

    }
}
