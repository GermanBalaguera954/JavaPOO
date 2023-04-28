/*Ejercicio7: Hacer un programa sencillo para realizar gestiones en un banco
para lo cual tendremos 2 clases Cliente y Cuenta. Considerar que un cliente
se caracteriza por su nombre , apellido y DNI. El cliente puede consultar 
saldo, asi como ingresar y retirar dinero de sus cuentas. Ademas cada cuenta
se caracteriza por un numero de cuenta y un saldo.*/
package ejercicio7;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public Cliente (String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double consultar_saldo(int n) {
        return cuentas[n].getSaldo();
    }
    
    public void ingresar_dinero(int n, double cantidad) {
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirar_dinero (int n, double cantidad) {
        cuentas[n].retirarDinero(cantidad);
    }
}
