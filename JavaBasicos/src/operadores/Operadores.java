

package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritméticos
		// +, -, /, *, %
		int a = 10;
		int b = 20; 
		double c =10.5;
		
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		
		//resta
		System.out.println("El resultado de la resta: " + (a - b));
		
		//división
		int división = a / b;
		System.out.println("El resultado de la división es: " + división);
		
		double division2 = (double)a / b;
		//por lomenos uno de los dos debe ser tipo double en este caso hacemos el casteo a la variable a o podemos definir un double desde declaraci[on de variables
		
		System.out.println("El resultado de la división es: " + division2);
		
		//multiplicaci[on 
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);
		
		//modulo residuo de div 
		double modulo = a % c;
		System.out.println("El modulo de la operacion es: " + modulo);
		
		
		/*operador de asignacion nos permite agregar valores dentro de una variable */
		int d = 5, e;// inicializamos variables vacias;
		e = 6; 
		System.out.println(d + " - " + e);
		
		//operadores de declaracion compuesta
		//+=, -=, *=, /=, %= 
		//operaci[on simplificada
		
		int f = 0, g =5;
		f += 5;
		//f = f +5 
		System.out.println(f);
		
		
		//operadoresrelacionales
		//<,>,<=,>=,== igualdad ,!= diferencia
		//dan como resultado un valor boolean true or false
		
		int h = 12, i = 25;
		String j = "hola";
		System.out.println(h>i);
		System.out.println(i != h);
		//System.out.println(j != h); nos marca error por que son diferentes tipos de datos
		
		//operador unario 
		//preasignaci[on y post asignacion ++,--
		
		int k = 0,l = 0;
		
		System.out.println(++k);
		System.out.println(k++);//primero lee valor y des pes suma por eso el resultado es 1 en lugar de dos
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//precedencia de operadores jerarqu[ia de operaciones
		
		int operacion = 4 + 5 * 6 / 3;
		//primero multiplica despu[es divide al [ultimo suma = 14
		System.out.println(operacion);
		 
		int operacion1 = (4 + 5) * 6 / 3;//18
		System.out.println(operacion1);
		
		int m = 0, n = 0;
		int operacion2 = ++m + n--;
		System.out.println(operacion2);//1
		
		
		//operador ternario operador  es un if abreviado
		//nos permite tomar una desici[on 
		
		int edad = 18, valor1 = 0, valor2 = 1; 
		
		int resultado = (edad <= 18) ? valor1 : valor2;//0, como edad es = a 18  true toma el primer valor
		System.out.println(resultado);
		
		
		
		int resultado1 = (edad <= 17) ? valor1 : valor2;//1, como edad es < a 18  false toma el segundo valor
		System.out.println(resultado1);
		
		int valor3 = (edad<=18) ? 2:1;
		
		
		
		//Operadores l[ogicos 
		//and - && este simb[olo se llama ampersand 
		//or - || este simbolo se llama pipe 
		//Not - ! convierte niega invierte la expresi[on de lado derecho lo contrario
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		
		System.out.println(true || false);//true
		System.out.println(true || !false);//true
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		System.out.println(num);
				
	}
}
