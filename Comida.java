
/**
 * Write a description of class Comida here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(09-02-2017)
 */
public class Comida
{
    // Atributo para las calorias de la comida
    private int calorias;
    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida, int calorias)
    {
        this.calorias = calorias;
    }

    /**
     * Metodo que devuelve las calorias de las comidas
     */
    public int getCalorias()
    {
        return calorias;
    }
}
