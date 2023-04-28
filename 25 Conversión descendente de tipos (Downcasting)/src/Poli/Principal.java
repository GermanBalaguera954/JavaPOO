//Conversión descendente de tipos (Downcasting)
package Poli;

public class Principal {

    public static void main(String[] args) {
        Vehiculo vehiculo = new VehiculoDeportivo(500, "GH89", "Audi", "A89"); //UPCASTING        
        VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;
        System.out.println(nuevoVehiculo);
    }
}
