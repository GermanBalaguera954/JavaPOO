package ClasesYObjetos;

public class Persona {

    //Atributos son las caracteristicas y son privadas.
    String nombre;
    int edad;

    //Metodos son la acciones y son publicas.
    //
    //Metodo constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostraDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El edad es: " + edad);
    }
}
