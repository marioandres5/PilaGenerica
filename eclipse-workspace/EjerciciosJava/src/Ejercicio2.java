import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        // Generar un tamaño aleatorio entre 10 y 20
        int tamaño = rand.nextInt(11) + 10; 

        // Crear el ArrayList y llenarlo con números aleatorios entre 0 y 100
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            numeros.add(rand.nextInt(101)); // Números entre 0 y 100
        }

        // Inicializar valores para cálculos
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Calcular suma, máximo y mínimo
        for (int num : numeros) {
            suma += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        

        // Mostrar resultados
        System.out.println("Lista de números generados: " + numeros);
        System.out.println("Tamaño de la lista: " + tamaño);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (float)suma/tamaño);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}