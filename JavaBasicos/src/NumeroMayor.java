import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		System.out.println("Introduce el primer n�mero: ");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int numero2 = sc.nextInt();
		System.out.println("Introduce el tercer n�mero: ");
		int numero3 = sc.nextInt();
		 
		if (numero1 > numero2 && numero1 > numero3){
			System.out.println("N�mero " + numero1 + " es el mayor");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("N�mero " + numero2 + " es el mayor");
		} else if (numero3 > numero1 && numero3 > numero2){
			System.out.println("N�mero " + numero3 + " es el mayor");
		}
		
	}
}
