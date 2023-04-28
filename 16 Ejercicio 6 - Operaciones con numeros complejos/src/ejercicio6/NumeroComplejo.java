/*
Ejercicio6: Construir un programa para trabajar con dos numeros complejos, implemente el
suiente men:

1. Sumar 2 numeros complejos.
2. Multiplicar 2 numeros complejos.
3. Comparar 2 numeros complejos (iguales o no).
4. Multiplicar 1 numero complejo por 1 entero.
 */
package ejercicio6;

public class NumeroComplejo {

    private double a;//Parte real.
    private double b;//Parte imaginaria.

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    /*
    numero1 = 3 + 4i
    numero1 = 2 + 5i    
    suma = 5 + 9i  
    NumeroComplejo numero1 = new NumeroComplejo (3,4);
    numero1.calcularSuma(numero2);
     */
    public NumeroComplejo calcularSuma(NumeroComplejo c) {
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }

    /*
    numero1 = 3 + 4i
    numero1 = 2 + 5i    
    suma = (3*2 - 4*5) + (3*5 + 4*2 )i  
     */
    public NumeroComplejo calcularProducto(NumeroComplejo c) {
        NumeroComplejo mult = new NumeroComplejo((a * c.getA() - b * c.getB()), (a * c.getB() + b + c.getA()));
        return mult;
    }

    /*
    numero1 = 3 + 4i
    numero1 = 3 + 4i    
     */
    public boolean comprobarIgualdad(NumeroComplejo c) {
        boolean igualdad = false;
        if ((a == c.getA()) && (b == c.getB())) {
            igualdad = true;
        }
        return igualdad;
    }

    /*
    numeroComplejo = 3 + 4i;
    entero = 2;
    
    mult = 2*3+2*4;
     */
    public NumeroComplejo multiplicarPorEntero(int x) {
        NumeroComplejo mult = new NumeroComplejo(a * x, b * x);
        return mult;
    }
}
