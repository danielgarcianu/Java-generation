import java.util.Scanner;

public class ScannerYBufer {
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int numero1 = sc.nextInt();
		System.out.println("Introduce otro n�mero");
		int numero2 = sc.nextInt();
		
		System.out.println("N�mero 1: " + numero1 + " N�mero 2: " + numero2);*/
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce un n�mero");
		int numero2 = sc.nextInt();
		
		
		
		System.out.println("Tu nombre es: " + nombre + " tu n�mero es: " + numero2);
		sc.close();
	
	}
}
/*trabar con next en logar de next int next lee hasta que encuentra un espacio next line lee todo
 * sc.close(); se usa para cerrar el scanner el scanner se cierra una vez que no vayamos a utilizarlo
 * para limpiar el buffer sc.nextLine(); lo que hace es sacar toda la informacion del buufer como enter 
 * 
 * 
 * */
 
