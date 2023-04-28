package ClasesYObjetos;

import javax.swing.JOptionPane;

//La clase se crea la primera letra en mayuscula y en singular Ejemplo: Operacion.
public class Operacion {
    
    //Atributos son las caracteristicas y son privadas.
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos son la acciones y son publicas.
    
    //Metodo para pedirle al usuario que no digite 2 números.
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numro uno: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numro dos: "));
    }    
    
    //Metodo para sumar ambos numeros.
    public void sumar(){
    suma = numero1+numero2;
    }
    
    //Metodo para restar ambos numeros.
    public void restar(){
    resta = numero1-numero2;
    }
    
    //Metodo para multiplicar ambos numeros.
    public void multiplicar(){
    multiplicacion = numero1*numero2;
    }
    //Metodo para dividir ambos numeros.
    public void dividir(){
    division = numero1/numero2;
    }
    
    
    //Metodo para mostrar los resultado de la operaciones.
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
