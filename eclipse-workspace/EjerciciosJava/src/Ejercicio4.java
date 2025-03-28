import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String [] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca una palabra:");
            String palabra = sc.next();
            ar.add(palabra);
            
		}
		
		Collections.sort(ar);
		
		System.out.println(ar);
	}
}