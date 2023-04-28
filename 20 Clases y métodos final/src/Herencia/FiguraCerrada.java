
package Herencia;


public class FiguraCerrada extends Figura{
    private int nLados;

    public FiguraCerrada(int nLados, double tamaño) {
        super(tamaño);
        this.nLados = nLados;
    }
    
    public void dibujar (){
        System.out.println("Dibujo de una figura cerrada");
    }
}
