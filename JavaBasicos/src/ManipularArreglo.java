
public class ManipularArreglo {
	public static void main(String[] args){
		
		//Crea una clase llamara ManipularArreglo
		//crea un array con los siguientes números enteros:

		//1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		//Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.

			
			int numeros [] = {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
			
			
			int sumCero = 0;
			int sumPar = 0;
			int sumImpar = 0;
			
	        for (int i = 0; i < numeros.length; i++) {
	        	
	            if (numeros[i] % 2 == 0) {
					sumPar+=numeros[i];
	            	//System.out.println("Pares= " + sumPar);
				} else {
					sumImpar+=numeros[i];
					//System.out.println("Impares= " + sumImpar);
	        }
	            
	            sumCero+=numeros[i];
	            // System.out.println("Suma = "+sumCero);
	             
	        
	          
	        	}
	        
	        System.out.println("Suma Total= "+sumCero);
	        System.out.println("Suma Total de Pares= " + sumPar);
	        System.out.println("Suma Total de Impares= " + sumImpar);
	        	
	}
}
