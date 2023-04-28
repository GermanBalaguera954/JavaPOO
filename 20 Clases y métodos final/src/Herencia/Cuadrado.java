package Herencia;

import java.util.logging.Logger;

public class Cuadrado extends FiguraCerrada{
private double area;
    private static final Logger LOG = Logger.getLogger(Cuadrado.class.getName());

    public Cuadrado(double area, int nLados, double tamaño) {
        super(nLados, tamaño);
        this.area = area;
    }

    public void dibujar(String[] args) {
        System.out.println("Dibujamos un cuadrado");
    }




}
