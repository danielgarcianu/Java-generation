import java.util.Scanner;

public class Tabla {
	public static void main(String[] args) {
	
	//Utilizando un bucle while

		//1.- Crea una nueva clase llamada Tabla
		//2.- Copia el siguiente codigo y verifica que funcione

			
			
					
			
			        Scanner console = new Scanner(System.in);
			        int num;
			        
			        System.out.print("Ingresa cualquier número positivo: ");
			        num = console.nextInt();
			                
			        System.out.println("Tabla de multiplicar de  " + num);
			        
			       int multi = 1;		
			       
			       while( multi <= 10) {
			    	   System.out.println(num + " x " + multi  + "=" + num * multi);
			    	   multi++;
			       }
			    
			

		//3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
	}
}
