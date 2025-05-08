import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class PilaGTest
{
    
    @Test
    public void testestaLleno(){
           PilaG <Integer> p = new PilaG(3);
           assertFalse(p.estaLleno());
           p.push(10);
           p.push(3);
           p.push(12);
           assertTrue(p.estaLleno());
           p.pop();
           assertFalse(p.estaLleno());
    }
    
    @Test
    public void testestaVacio(){
          PilaG <Integer> p = new PilaG(3);
           assertTrue(p.estaVacio());
           p.push(10);
           assertFalse(p.estaVacio());
           p.pop();
           assertTrue(p.estaVacio());
        }
    
    @Test
    public void testpush()
    {
           PilaG <Integer> p = new PilaG(2);
           assertTrue(p.push(5));
           assertTrue(p.push(10));
           assertFalse(p.push(20)); //Esta lleno
           p.pop(); // Quita el diez
           assertTrue(p.push(10));
           assertTrue(p.pop() == 10);
           assertTrue(p.peek() == 5);
           assertTrue(p.pop() == 5);
    }
    
    @Test
    public void testpop(){
          PilaG <Integer> p = new PilaG(2);
           assertTrue(p.pop() == null); // No hay datos
           assertTrue(p.push(5));
           assertTrue(p.push(10));
           assertTrue(p.pop() == 10);
           assertTrue(p.pop() == 5);
           // Lo mismo de distintas formas
           assertTrue(p.pop() == null); // No hay datos
           assertEquals(null, p.pop()); // No hay datos
           Integer resu = p.pop();
           assertNull(resu);
    }  
    
    @Test
    public void testpeek(){
           PilaG <Integer> p = new PilaG(2);
           assertTrue(p.peek() == null); // No hay datos
           p.push(5);
           p.push(10);
           assertTrue(p.peek() == 10);
           assertTrue(p.peek() == 10);
           p.pop();
           assertTrue(p.peek() == 5);
           p.pop();
           assertEquals(null, p.peek()); // No hay datos
           Integer resu = p.peek();
           assertNull(resu);
           
    }
}