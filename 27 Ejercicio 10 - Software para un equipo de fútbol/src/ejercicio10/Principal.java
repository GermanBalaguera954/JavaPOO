/*
Ejercicio10: Crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor),
para lo cual tendremos lo siguiente.
    -Una super clase Persona, que tendra los siguientes datos: nombre, apellido, edad.
    -La sub clase Futbolista, tendra los siguientes datos: dorsal y posicion.
    -La sub clase Entrenador tendra de dato la estrategia que utiliza.
    -La sub clase Doctor tendra la titulacion y los años de experiencia.

Hacer un menu donde se tengan los siguientes opciones:
    1. Viaje de equipo.
    2. Entrenamiento.
    3. Partido de futbol.
    4. Planificar entrenamiento.
    5. Entrevista.
    6. Curar lesion.
 */
package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista1 = new Futbolista(9, "Delantero", "Gonzalo", "Higuain", 29);
    static Persona futbolista2 = new Futbolista(21, "Delantero", "Pablo", "Dybala", 23);
    static Persona entrenador = new Entrenador("Defensiva", "Maximiliano", "Allegri", 49);
    static Persona medico = new Medico("Licenciado en fisioterapia", 20, "Alex", "Marroni", 55);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);
        
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("\t MENU ");
            System.out.println("1. Viaje de equipo.");
            System.out.println("2. Entrenamiento.");
            System.out.println("3. Partido de futbol.");
            System.out.println("4. Planificar entrenamiento.");
            System.out.println("5. Entrevista.");
            System.out.println("6. Curar lesion.");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    viajarEquipo();//Viaje de equipo
                    break;
                case 2:
                    System.out.println("");
                    entrenarEquipo();//Entrenamiento
                    break;
                case 3:
                    System.out.println("");
                    partidoFutbol();//Partido de futbol
                    break;
                case 4:
                    System.out.println("");
                    planificarEntrenamiento();//Planificar entrenamiento
                    break;
                case 5:
                    System.out.println("");
                    darEntrevista();//Entrevista
                    break;
                case 6:
                    System.out.println("");
                    curarLesion();//Curar lesion
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Error, se equivoco de opcion de menu");
                    break;
            }
            System.out.println("");
        } while (opcion != 7);
    }

    public static void viajarEquipo() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " -> ");
            equipo.viajar();
        }
    }

    public static void entrenarEquipo() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " -> ");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol() {
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellido() + " -> ");
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrenamiento() {
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellido() + " -> ");
        ((Entrenador) entrenador).planificarEntrenamiento();//Downcasting
    }

    public static void darEntrevista() {
        System.out.print(futbolista1.getNombre() + " " + futbolista1.getApellido() + " -> ");
        ((Futbolista) futbolista1).entrevista();//Downcasting

        System.out.print(futbolista2.getNombre() + " " + futbolista2.getApellido() + " -> ");
        ((Futbolista) futbolista2).entrevista();//Downcasting
    }

    public static void curarLesion() {
        System.out.print(medico.getNombre() + " " + medico.getApellido() + " -> ");
        ((Medico) medico).curarLesion();//Downcasting
    }
}
