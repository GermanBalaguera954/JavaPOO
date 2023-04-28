
package paquete1;

public class Persona {
    
    //Atributo encapsulado
    private final String nombre;//final se usa para indicar que es una constante y no va cambiar.
    private int edad;

    //Constructor.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("El edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    
}
