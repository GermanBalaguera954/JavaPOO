package ClasesYObjetos;

public class Persona {

    //Atributos son las caracteristicas y son privadas.
    String nombre;
    int edad;
    String cc;

    //Metodos son la acciones y son publicas.
    //Constructor de los atributos nombre y edad.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor del atributo cc.
    public Persona(String cc) {
        this.cc = cc;
    }

    public void correr() {
        System.out.println("Soy " + nombre + " tengo " + edad + " años y estoy corriendo una maraton");
    }

    public void correr(int km) {
        System.out.println("He corrido " + km + " Kilometros");
    }
}
