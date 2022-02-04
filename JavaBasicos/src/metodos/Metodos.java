package metodos;

public class Metodos {
	//método
	//atributos de la clase 
	int a,b;
	//Métodovoid metodo vacio no devuelve ningún valor
	
	public void sumar() {
		int resultado =a + b;
		System.out.println("El resultado de sumar " + a + "mas" + b + "es " + resultado );
	}
	
	//metodo con retornos
	public int sumarConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return a + b;//lo mismo de arriba pero simplificado
	}

	//argumentos
	//suma(//argumentos)
	
	public double multiplicarArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
	} //los argumentos solo se usan dentro de este metodo
	
	//Metodo estático
	//no requiere que se cree un objeto para poder ser utilizado pertenece  ala clase 
	//estatico, void (no regresa datos), usa argumentos 
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
	
	
	
	
	
}


/*en java la clase man solo ejecuta los demás procesos estan en otras clases*/