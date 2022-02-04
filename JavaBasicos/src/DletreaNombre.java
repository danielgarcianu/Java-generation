import java.util.Scanner;

public class DletreaNombre {
	public static void main(String[] args) {
		
		System.out.println("Ingresa tu nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		for (int i = 0; i < nombre.length(); i++){
			
			System.out.println(nombre.charAt(i));
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}
}
