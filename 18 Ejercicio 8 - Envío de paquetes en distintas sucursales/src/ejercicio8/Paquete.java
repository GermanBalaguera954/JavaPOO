/*
Ejercicio8: Una empresa de envio de paquetes tiene varias sucursales en todo el pais.
Cada sucursal esta definida por su numero de sucursal, direccion y ciudad. Para calcular
el precio que cuesta enviar cada paquete, las sucursales tienen en cuenta el precio del
paquete y la prioridad, sabiendo que se cobra un dolar por kilo, 10 dolares mas si la
prioridad es alta y 20 si es express. Cada paquete enviado tendra un numero de referencia
y el dni de la persona que lo envia.
 */
package ejercicio8;

public class Paquete {

    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String mostrarDatosPaquete() {
        return "Numero paquete: " + numeroPaquete
                + "\ndni: " + dni
                + "\nPeso: " + peso
                + "\nPrioridad: " + prioridad;
    }
}
