package ClasesYObjetos;

public class Operacion {
    //Atributos son las caracteristicas y son privadas.
    //
    //Para este ejemplo no va tener atributos

    //Metodos son la acciones y son publicas.
    //
    //Metodo para sumar ambos numeros.
    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    //Metodo para restar ambos numeros.
    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    //Metodo para multiplicar ambos numeros.
    public int multiplicar(int numero1, int numero2) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    //Metodo para dividir ambos numeros.
    public int dividir(int numero1, int numero2) {
        int division = numero1 / numero2;
        return division;
    }
}
