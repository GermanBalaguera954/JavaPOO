/*
Ejercicio9: Hacer un programa para calcular el area de poligonos (Triangulos y Rectangulos)
el programa debe ser capaz de almacenar en un arreglo N triangulos y rectanulos, y al final
mostrar el area y los datos cada uno.Para ello se tendra lo siguiente:
    -Una super clase llamada Poligono.
    -Una sub clase llamada Rectangulo.
    -Una sub clase llamada Triangulo.
 */
package ejercicio9;

public abstract class Poligono {

    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero Lados= " + numeroLados;
    }

    //Declaramos el metodo area como abstracto. 
    public abstract double area();

}
