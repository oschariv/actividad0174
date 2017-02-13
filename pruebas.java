import java.util.ArrayList;
/**
 * Write a description of class pruebas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pruebas
{

    public pruebas()
    {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numerosOrdenados = new ArrayList<Integer>();
        numeros.add(20); //1
        numeros.add(10); //2
        numeros.add(15); //3
        numeros.add(8);  //4
        numeros.add(4);  //5
        numeros.add(21); //6
        numeros.add(82); //7
        numeros.add(2);  //8
        numeros.add(1);  //9
        numeros.add(25); //10
        
        ArrayList<Integer> numerosCopia = new ArrayList<Integer>();
        
        for (int indice = 0; indice < numeros.size(); indice++) {
            numerosCopia.add(numeros.get(indice));
        }
        
        int numeroElementos = numeros.size();
        for (int indiceLento = 0; indiceLento < numeroElementos; indiceLento++){
            int valorMaximo = -1;
            int posicionElementoMaximo = 0;
            for(int posicionActual = 0; posicionActual < numerosCopia.size(); posicionActual++)
            {
                if (numeros.get(posicionActual) > valorMaximo)
                {
                    valorMaximo = numerosCopia.get(posicionActual);
                    posicionElementoMaximo = posicionActual;
                }
            }
            numerosOrdenados.add(valorMaximo);
            numerosCopia.remove(posicionElementoMaximo);
        }
        
        System.out.println(numeros);
        System.out.println(numerosCopia);
        System.out.println(numerosOrdenados);
    }

}
