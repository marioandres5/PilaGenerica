import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un ArrayList de nombres
        ArrayList<String> nombres = new ArrayList<>();
        
        // Agregar nombres al ArrayList
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");
        nombres.add("Javier");
        nombres.add("Sofía");

        // Mostrar los nombres usando un bucle for-each
        System.out.println("Lista de compañeros:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
