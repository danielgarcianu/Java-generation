import java.util.Scanner;

public class EjercicioTri�ngulo {
	public static void main(String[] args) {
		
		System.out.println("Introduce el primer �ngulo: ");
		Scanner sc = new Scanner(System.in);
		int angulo1 = sc.nextInt();
		System.out.println("Introduce el segundo �ngulo: ");
		int angulo2 = sc.nextInt();
		System.out.println("Introduce el tercer �ngulo: ");
		int angulo3 = sc.nextInt();
		int suma = angulo1 + angulo2  +angulo3;
		
		if(suma == 180) {
			System.out.println("La suma de tu tri�ngulo es: 180 tu tri�ngulo cumple con la condici�n");
		} else if (suma < 180){
			System.out.println("La suma de tus �ngulos es menor de 180 no es un tri�ngulo");
		} else {
			System.out.println("La suma de tus �ngulos es mayor de 180 no es un tri�ngulo");
		}
		sc.close();
		
	}
}
