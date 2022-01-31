import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		System.out.println("Introduce el primer número: ");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		System.out.println("Introduce el tercer número: ");
		int numero3 = sc.nextInt();
		 
		if (numero1 > numero2 && numero1 > numero3){
			System.out.println("Número " + numero1 + " es el mayor");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("Número " + numero2 + " es el mayor");
		} else if (numero3 > numero1 && numero3 > numero2){
			System.out.println("Número " + numero3 + " es el mayor");
		}
		
	}
}
