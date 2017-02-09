
/**
 * Write a description of class Persona here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(09-02-2017)
 */
public class Persona
{
    // atributo para saber si en hombre o mujer.
    private boolean hombre;
    // atributo para saber el peso de la persona.
    private int peso;
    // atributo para saber la altura de la persona.
    private int altura;
    // atributo para saber la edad de la persona.
    private int edad;
    // Metabolismo basal hombres
    private int metabolismoBasalHombres;
    // Metabolismo basal mujeres
    private int metabolismoBasalMujeres;
    // atributo calorias ingeridas
    private int caloriasIngeridas;
    /**
     * Constructor for objects of class Persona
     * Si el booleano hombre es igual true la persona es un hombre y si es false 
     * la persona es una mujer.
     * Peso es un entero en kilogramos.
     * Altura es un entero en centimetros
     * Edad es un entero en años.
     */
    public Persona(String nombrePersona, boolean hombre, int peso, int altura, int edad)
    {
        this.hombre = hombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        metabolismoBasalHombres = 0;
        metabolismoBasalMujeres = 0;
        caloriasIngeridas = 0;
        
    }

    /**
     *  Metodo que permite dar de comer a una persona.
     */
    public int comer(Comida comida)
    {
        int calorias = -1;
        
        if (hombre){
           // Hombres = (10 x peso en kg) + (6 × altura en cm) 
           //- (5 × edad en años) + 5 
           metabolismoBasalHombres = (10 * peso) + (6 * altura) + (5 * edad) + 5;
           if (caloriasIngeridas <= metabolismoBasalHombres){
               calorias = comida.getCalorias();
               caloriasIngeridas += calorias;
           }
           else{
               System.out.println("No puedo comer mas");
           }
        }
        else{
            // Mujeres = (10 x peso en kg) + (6 × altura en cm) 
            //- (5 × edad en años) - 161
            metabolismoBasalMujeres = (10 * peso) + (6 * altura) + (5 * edad) - 161;
            if (caloriasIngeridas <= metabolismoBasalMujeres){
               calorias = comida.getCalorias();
               caloriasIngeridas += calorias;
           }
           else{
               System.out.println("No puedo comer mas");
           }
        }
        
        return calorias;
    }
    
    /**
     * Metodo que permite conocer las calorias ingeridas.
     */
    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }
    
}
