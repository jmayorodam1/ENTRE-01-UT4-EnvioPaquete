
/**
 *  Representa una dimensión
 *  
 *  @author - Javier Mayor
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        Dimension copia = new Dimension(this.alto,this.ancho,this.largo);
        return copia;

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String str = String.format("\nAlto:\t %10.2f(cm)\nAncho: \t %10.2f(cm)\nLargo: %10.2f(cm)",alto,ancho,largo);
        return str;

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
