/**
 * Esta clase representa objetos circulo con un radio;
 * @author Raul Glez Glez
 * @version 2.0
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
   {
       radio=unRadio;
    }
    @Override
    public void calcularArea()
    {
        area=3.14f*radio*radio;
    }
}