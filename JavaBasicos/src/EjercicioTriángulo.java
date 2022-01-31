import java.util.Scanner;

public class EjercicioTriángulo {
	public static void main(String[] args) {
		
		System.out.println("Introduce el primer ángulo: ");
		Scanner sc = new Scanner(System.in);
		int angulo1 = sc.nextInt();
		System.out.println("Introduce el segundo ángulo: ");
		int angulo2 = sc.nextInt();
		System.out.println("Introduce el tercer ángulo: ");
		int angulo3 = sc.nextInt();
		int suma = angulo1 + angulo2  +angulo3;
		
		if(suma == 180) {
			System.out.println("La suma de tu triángulo es: 180 tu triángulo cumple con la condición");
		} else if (suma < 180){
			System.out.println("La suma de tus ángulos es menor de 180 no es un triángulo");
		} else {
			System.out.println("La suma de tus ángulos es mayor de 180 no es un triángulo");
		}
		sc.close();
		
	}
}
