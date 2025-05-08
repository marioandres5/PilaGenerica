/**
 * Ejemplo de implementacion de una Pila de Enteros (cola FIFO)
 * 
 * @author (Álvaro Redondo) 
 * @version (1.0)
 */
public class PilaEnteros {
	// instance variables - replace the example below with your own
    private int cima;
    private int [] almacen;

    /**
     * Constructor de la clase PilaEnteros
     * 
     * @param tamaño  Capacidad maxima de la pila de Enteros
     */
    public PilaEnteros(int tamaño)
    {
        // initialise instance variables
        cima = 0;
        almacen = new int [tamaño];
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
     *   @return true o false si no puede añadirlo
     */
    public boolean push(int valor)
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
     *   @return el valor devuelto o -1 si no hay valores
     */
    public int pop(){
        int resu;
        if (! estaVacio() ){
            cima--;
            resu = almacen[cima];
        }
        else{
            resu = -1;
        }
        return resu;
    }  
    
    /**
     *   peek  Devuelve el ultimo elemento de la pila sin borrarlo
     *   @return el valor devuelto o -1 si no hay valores
     */
   
    public int peek(){
       int resu;
        if (! estaVacio() ){
            resu = almacen[cima-1];
        }
        else{
            resu = -1;
        }
        return resu;
    }
}


