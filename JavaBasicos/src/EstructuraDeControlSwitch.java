import java.util.Scanner;

public class EstructuraDeControlSwitch {

	/*Estructuras de control nos sirve para controlar el flujo de comportamiento de un programa
	 * para la toma de decisiones*/
	
	/*Switch(condicion_a_evaluar){
	 	case "valor":
	 		//codigo a ejecutar
	 		//break
	 	case 'n':
	 		//codigo a ejecutar 
	 		//break
	 	default:
	 		//codigo a ejecutar
	 		
	 }
	 */ 
	public static void main(String[] args) {
		
		System.out.println("Introduce un dia de la semana y recibe un bonito mensaje");
		Scanner sc = new Scanner(System.in);
		String dia =sc.nextLine();
		
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un cafe");
			break;
		case "martes":
			System.out.println("Lunes chiquuito. ");
			break;
		case "mi�rcoles":
			System.out.println("Mi�rcoles, pero a qu� costo.");
			break;
		case "Jueves":
			System.out.println("Juebebes de sed peligrosa");
			break;
		case "Viernes":
			System.out.println("Viernes de fiesta hasta morir");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Basta de trabajacion");
		break;
		default:
			System.out.println("Dia desconocido, kha");
			sc.close();
		
	}
	//solicitar� 
	
		
	}	
}
/*a diferencia del if en valor se introduce el resultado esperado */