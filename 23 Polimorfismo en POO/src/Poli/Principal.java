package Poli;

public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehciulos[] = new Vehiculo[4];
        
        misVehciulos[0]=new Vehiculo("GH67","Ferrari","A89");
        misVehciulos[1]= new VehiculoTurismo(4,"78HJ","Audi","P14");
        misVehciulos [2]= new VehiculoDeportivo(500,"45GH","Toyota","KJ8");
        misVehciulos [3]= new VehiculoFurgoneta(1000,"JI8","Toyota","J9");
        
        for(Vehiculo vehiculos: misVehciulos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }

}
