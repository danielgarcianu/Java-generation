
public class Ciclos {
	public static void main(String[] args) {
		
		//while
		
		/*int control = 0;
		
		while (control < 10) {
			System.out.println("control= " + control);
			control++;
		}*/
		
		//do while 
		/*int control = 3;
		do {
			//codigo a jecutar
			System.out.println("Control = " + control);
			//modificador de la variable control
			control++;
		} while(control < 3);*/
		
		
		//for 
		
		/*for(int i=0;i < 3;i++) {
			System.out.println("Control = " + i);
		}*/
		
		//break & continue
		/*for(int i=0;i < 10;i++) {
			if(i % 2 == 0){//solo se ejecuta cuando el valor de i sera numero par
			System.out.println("Control = " + i);
			break;
			}
		}*/
		
		for(int i=0;i < 10;i++) {
			if(i % 2 == 0){//solo se imprime cuando el valor de i sera numero par
			
			continue;
			}
			System.out.println("Control = " + i);
		}
		
	}	

}
/*Siempre debe haber una variable a modificar control i++ de lo contrario imprimiria siempre control por que siempre será 1 y uno siempre es menor que 10
 * 
 * do while se ejecuta una vez antes de hacer la condiciónn
 * for la variable de control solo vive dentro de la variable for 
 * break & continue pueden modificar la estructura del for break termina el ciclo solo deja que se ejecute una ves lo que esta antes
 * */
