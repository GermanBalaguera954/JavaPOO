package ClasesYObjetos;

public class Coche {

    //Atributos
    String color;
    String marca;
    int km;

    //Metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche1 es: " + coche1.color);
        System.out.println("El marca del coche1 es: " + coche1.marca);
        System.out.println("El kilometraje del coche1 es: " + coche1.km);
        
        System.out.println("");
        
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println("El color del coche2 es: " + coche2.color);
        System.out.println("El marca del coche2 es: " + coche2.marca);
        System.out.println("El kilometraje del coche2 es: " + coche2.km);
    }
}
