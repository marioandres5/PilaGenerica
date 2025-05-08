
/**
 * Ejemplo de implementacion de una PILA (cola LIFO)
 * usando una clase generica
 * 
 * @author (Álvaro Redondo) 
 * @version (1.0)
 */
public class PilaG <Tipo>
{
    /**
     * Número de elementos o posición 
     */
    private int cima;
    /**
     * Tabla de objetos donde se los datos
     */
    private Tipo [] almacen;

    /**
     * Constructor de la clase Pila
     * 
     * @param tamaño  Capacidad maxima de la pila de Enteros
     */
    public PilaG (int tamaño)
    {
        // Cero 
        cima = 0;
        // NO se puede crear un array generico
        // almacen = new T [tamaño]
        almacen = (Tipo []) new Object [tamaño];
    }

    /**
     *   estaLleno Indica si esta llena la PILA
     *   @return true o false
     */
    public boolean estaLleno(){
       return (cima == almacen.length);    
    }
    
    /**
     *   estaVacia Indica si esta vacia la PILA
     *   @return true o false
     */
    public boolean estaVacio(){
      return (cima == 0);    
    }
    
    /**
     *   push  Añade un elemento a la pila
     *   @param valor a introducir en la pila
     *   @return true o false si no puede añadirlo
     */
    public boolean push(Tipo valor)
    {
       if ( !estaLleno()){
           almacen[cima] = valor;
           cima++;
           return true;
        }
        return false;
    }
    
    /**
     *   pop  Devuelve el ultimo elemento de la pila eliminadolo de la pila
     *   @return el valor devuelto o null si no valores
     */
    public Tipo pop(){
        Tipo resu;
        if (! estaVacio() ){
            cima--;
            resu = almacen[cima];
        }
        else{
            resu = null;
        }
        return resu;
    }  
    
    /**
     *   peek  Devuelve el ultimo elemento de la pila sin borrarlo
     *   @return el valor devuelto o -1 si no hay valores
     */
    public Tipo peek(){
       Tipo resu;
        if (! estaVacio() ){
            resu = almacen[cima-1];
        }
        else{
            resu = null;
        }
        return resu;
    }
    
}