import java.util.Scanner;

public class Clculadora {
	public static void main(String[] args) {
		/*
		   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) División
		   * 4) Multiplicación
		   * 
		   * y despues imprimir el resultado
		   */
			System.out.println("Introduce un numero entero:");
			Scanner sc = new Scanner(System.in); 
			int numero1 = sc.nextInt();
			System.out.println("Introduce otro numero entero:");
			int numero2 = sc.nextInt();
			
			System.out.println("elige que vas a hacer con tus números");
			System.out.println("presiona 1 para sumar");
			System.out.println("presiona 2 para restar");
			System.out.println("presiona 3 para multiplicar");
			System.out.println("presiona 4 para dividir");
			int opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println(numero1 + numero2);
				break;
			case 2:
				System.out.println(numero1 - numero2);
				break;
			case 3:
				System.out.println(numero1 * numero2);
				break;	
			case 4:
				System.out.println((double)numero1 / numero2);
				break;
			default:
				System.out.println("No es una operación");
			}
			sc.close();
			
	}
}
