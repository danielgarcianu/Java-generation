
public class Arreglos {
	public static void main(String[] args) {
	//Solo un tipo de dato
	//especificar el tamaño o la cantidad de elementos que va a contener
	
	
	//primer manera
	
	int numeros[];//creamos la variable 
	numeros = new int[4];//creamos el arreglo especificando el numero de datos 
	
	//segunda manera
	
	String[] nombres = new String[4];//su distribuciòn se basa en [0,1,2,3]
	
	//tercer manera array literal
	
		String nombreFrutas[] = new String[]{"Manzana", "Platano", "Uva", "Pera"};
	
	numeros[0] = 10;
	numeros[1] = 8;
	numeros[2] = 90;
	numeros[3] = 100;
	
	nombres[0]= "Juan";
	nombres[1]= "Pedro";
	nombres[2]= "Antonio";
	nombres[3]= "Felipe";
	
	System.out.println(numeros[0]);
	System.out.println(numeros[3]);
	
	for(int i=0; i < numeros.length; i++) {
		System.out.println("Elemento de numeros" + numeros[i]);
		System.out.println("Elemento de nombres" + nombres[i]);
		System.out.println("Elemento de frutas" + nombreFrutas[i]);
		System.out.println("---------------------------------");
	}
	
	
	
	
	
	
	
	
	}
}

//length en un array es una propiedad y no se usan los parentesis cuando es un metodo se usan los parentesis
//error de tiempo de ejecucion cuando dentro de el arreglo insertamos un damo mas que el numero de elementos especificado en el arreglo 
//es decir declaramos que el arreglo tiene 4 datos  e intentamos meter 5 


