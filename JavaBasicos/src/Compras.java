import java.util.Scanner;

public class Compras {
	public static void main(String[] args) {
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1000 - 4999 10%
		// si la cuenta es de 5000 a 9999 20%
		// si la copra es de 10000 o más 30%


				// 	imprimir el total con los descuentos incluidos
		
		System.out.println("Ingresa el total de tu compra: ejemplo 0.00");
		Scanner sc = new Scanner(System.in);
		double compra = sc.nextDouble();
		
		if (compra <= 1000) {
			System.out.println("El total de tu comora es: " + compra);
		} else if (compra >= 1000 && compra <= 4999) {
			double descuento = compra * .10;
			System.out.println("Tu total con descuento es: " + (compra-descuento));
		} else if (compra >= 500 && compra <= 9999) {
			double descuento = compra * .20;
			System.out.println("Tu total con descuento es: " + (compra-descuento));
		} else if (compra >= 10000) {
			double descuento = compra *.30;
			System.out.println("Tu total con descuento es: " + (compra-descuento));
		}
			
	}
	
}
