import java.util.ArrayList;
/**
 * Write a description of class Persona here.
 * 
 * @author oschariv(Oscar Charro Rivera) 
 * @version 1.0(09-02-2017)
 */
public class Persona
{
    // atributo que guarda la variale nombre
    private String nombre;
    // atributo para saber si en hombre o mujer.
    private boolean hombre;
    // atributo para saber el peso de la persona.
    private int peso;
    // atributo para saber la altura de la persona.
    private int altura;
    // atributo para saber la edad de la persona.
    private int edad;
    // Atributo del Metabolismo basal
    private int metabolismoBasal;
    // atributo calorias ingeridas
    private int caloriasIngeridas;
    // Atributo para alimento mas calorico.
    private Comida alimentoMasCalorico;
    // Atributo para guardar la comida mas calorica ya consumida
    private Comida comidaYaConsumida;
    
    private ArrayList<Comida> comidasIngeridas;

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
        nombre = nombrePersona;
        this.hombre = hombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        metabolismoBasal = 0;
        caloriasIngeridas = 0;
        alimentoMasCalorico = null;
        
        comidaYaConsumida = null;
        
        comidasIngeridas = new ArrayList<Comida>();
    }

    /**
     * Metodo que permite obtener el metabolismo basal de la persona
     */
    public int getMetabolismoBasal(){

        if (hombre){
            // Hombres = (10 x peso en kg) + (6 × altura en cm) 
            //- (5 × edad en años) + 5 
            metabolismoBasal = (10 * peso) + (6 * altura) + (5 * edad) + 5;
        }
        else{
            // Mujeres = (10 x peso en kg) + (6 × altura en cm) 
            //- (5 × edad en años) - 161
            metabolismoBasal = (10 * peso) + (6 * altura) + (5 * edad) - 161;
        }
        return metabolismoBasal;
    }

    /**
     *  Metodo que permite dar de comer a una persona.
     */
    public int comer(Comida comida)
    {
        int calorias = -1;

        if (caloriasIngeridas <= getMetabolismoBasal()){
                calorias = comida.getCalorias();
                caloriasIngeridas += calorias;
        }
        else{
                System.out.println("No puedo comer mas");
        }
        

        if (comidaYaConsumida == null){
            comidaYaConsumida = comida;
            alimentoMasCalorico = comida;
        }
        else{
            if (comida.getCalorias() >= comidaYaConsumida.getCalorias()){
                alimentoMasCalorico = comida;
                comidaYaConsumida = comida;
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

    /**
     * Metodo que permite realizar preguntas a la persona.
     */
    public String contestar(String pregunta){
        String respuesta = "";
        if (getCaloriasIngeridas() <= getMetabolismoBasal()){
            if (pregunta.length()%3 == 0){
                respuesta = "SI";
            }else{
                respuesta = "NO";
            }
        }

        if (getCaloriasIngeridas() > getMetabolismoBasal() || pregunta.contains(nombre)) {
            respuesta = pregunta.toUpperCase();
        }
        System.out.println(respuesta);
        return respuesta;
    }

    /**
     * 
     */
    public Comida getAlimentoMasCaloricoConsumido(){
        if (alimentoMasCalorico == null){
            System.out.println("No ha consumido nada");
        }
        else{
            System.out.println(alimentoMasCalorico.getNombreComida());
        }
        return alimentoMasCalorico;
    }
    
    /**
     * 
     */
    public void verListadoComidasIngeridas(){
        
    }
}

