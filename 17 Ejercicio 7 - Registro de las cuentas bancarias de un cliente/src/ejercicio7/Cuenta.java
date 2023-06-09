/*Ejercicio7: Hacer un programa sencillo para realizar gestiones en un banco
para lo cual tendremos 2 clases Cliente y Cuenta. Considerar que un cliente
se caracteriza por su nombre , apellido y DNI. El cliente puede consultar 
saldo, asi como ingresar y retirar dinero de sus cuentas. Ademas cada cuenta
se caracteriza por un numero de cuenta y un saldo.*/
package ejercicio7;

public class Cuenta {

    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresarDinero(double cantidad){
    saldo += cantidad;    
    }
    
    public void retirarDinero(double cantidad){
    saldo -= cantidad;    
    }
}
