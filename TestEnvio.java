
/**
 * Clase de prueba
 * 
 * @author- Javier Mayor 
 */
public class TestEnvio
{

    /**
     * Constructor for objects of class TestEnvio
     */
    public TestEnvio()
    {

    }
    
    /**
     */
    public static void main(String[] args) {

        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        Envio envi = new Envio();
        envi.addPaquete(paquete1);
        envi.addPaquete(paquete2);
        envi.print();

        Paquete paquete3 = new Paquete(new Dimension(50,50,70),13);
        envi.addPaquete(paquete3);
        envi.print();
        envi.addPaquete(paquete2.obtenerCopia());

    }


}
