import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String [] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un número");
			int num = sc.nextInt();
            ar.add(num);
		}
		
		Collections.sort(ar);
		
		System.out.println(ar);
	}
}