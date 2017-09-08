/**
 * superclase para representar las caracteristicas de muchas figuras.
 * 
 * @author Raul Gonzalez Gonzalez
 * @version 2.0
 */
public class Figura
{
    protected float area;
    
    public Figura()
    {
        area=0;
    }
    
    public void calcularArea()
    {
        System.out.println("No se como calcular el area porque no se de que figura se trata");
    }
    public void imprimirArea()
   {
       System.out.println("el area de la figura es:"+area);
       
    }
}
        
    