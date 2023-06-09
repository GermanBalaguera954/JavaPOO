
package ejercicio10;

public class Medico extends Persona{
    private String titulacion;
    private int añosExperiencia;

    public Medico(String titulacion, int añosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Da asistencia en un partido de futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en un entrenamiento");
    }
    
    public void curarLesion(){
        System.out.println("Curar lesion");
    }
}
