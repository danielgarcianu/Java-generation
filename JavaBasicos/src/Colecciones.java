import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class Colecciones {
	public static void main(String[] args) {
		
		//Las colecciones nos sirven para almacenar un conjunto de objetos
		
		//la diferencia de las colecciones y los objetos es que las colecciones son dinamicas 
		//podemos agregar o remover elementos, pueden cambiar el n[umero de objetos agregados
		
		//Set tiene 3 implementaciones
		//no puede contener elementos repetidos
		//es el implemento mas rápido
		

		//HashSet
		//los elementos no mantienen un orden
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		//foreach, puede recorrer una coleccion y en cada
		//ercorrido recupera el valor de una variable y lo podemos almacenar
		//en una variable 
		//Sintaxis 
		//for(tipoDeElemento variable : elemento a recorrer)
		for(String fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		//TreeSet
		//esta implementaci[on ordena los elementos en función de sus valores
		//la implementación es mas lenta los ordena por orden alfabetico
		
		/*Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}*/		
		
		
		
		
		//LinkedHashSet
		//ordena los elementos en orden de insersión
		// es mas costoso que HashSet y menos que TreeSet
		
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		
		//List tienen dos tipos de implementaciones
		//se permiten elementos duplicados 
		//acceder a elementos específicos
		//permite buscar elementos
		
		//ArrayList
		
		List<String> pokemones =new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Evee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		
		//add si agregamos un indice y un elemento, posiciona
		//el elemento en el indice y realiza un desplacamiento 
		//es decir no borra el elemento en la posición si no que lo desplaza
		pokemones.add(2, "Pikachu");//inserta el elemento en la posición 2 y desplaza el elemento que estaba en posición 2 a la posición 3
		
		//remove borra el elemento de la posición seleccionada.
		pokemones.remove(0);
		
		//Set reemplaza el elemento seleccionado 
		pokemones.set(0, "Flareon");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
			
			//index of nos va a devolver la posici[on del elemtno
			//y si el elemtno no se encuentra nos devuelve -1
			
			System.out.println(pokemones.indexOf("Gengar")); //busca el elemento dentro de la coleccion y nos da la posicion si hay dos elementos repetidos nos da el que encuentre primero 
			//System.out.println(pokemones.lastIndexOf("Gengar")); nos devuelve el que este en ultima posición
			//System.out.println(pokemones.indexOf("Togepi")); nos devuelve -1 por que el pokemon no esta en la colecci[on 
			
		}
		
		System.out.println("*********************");
		System.out.println(pokemones.get(4));//obtiene elementos por su posición
		System.out.println("*********************************");
		
		
		
		//LinkedList
		List<String> digimones =new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		
		//Map
		//Asocia claves a valores
		//no puede contener claves duplicadas
		//Sólo puede tener un valor asociado
		
		//HashMap
		//es parecida a HashSet tiene mayor rendimiento pero no garantiza un orden 
		//a la hora de hacer iteraciones
		//hashmap no acepta claves duplicadas
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(41, "Carlos Eduardo");
		usuarios.put(32, "Raúl");
		usuarios.put(33, "Ro");
		
		System.out.println(usuarios.get(41));
		
		
		//keySet 
		//Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		//values
		//nos permite recuperar el valor directamente 
		
		
		System.out.println(usuarios.values());
		
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "mole rojo");
		tamales.put("Torta", "Mole verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println("***********************************************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento ->{
			//System.out.println(elemento.getKey().toString()+ elemento.getvalue().toString());
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		});
		
		
		//linkedHashMap
		
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		//guarda los elementos, según el orden el que se hayan insertado
		carros.put(1, "Volvo");
		carros.put(7, "Ford");
		carros.put(923, "Chevrolet");
		
		System.out.println("********************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
		
		
		
		
		
	}
}
	

//<>se usa para indicar el tipo de datos
//para recorrer la coleccion voy a usar ciclos
//String fruta : frutas cada que recorras la coleccion frutas crea una variable fruta y guarda ahi el valor 
//HashSet se usa cuando queremos recuperar una colecci[on y no importa el orden 
//Set<String> frutas = new HashSet<String>(); dentro de el parentesis se escribe el numero con que se va a inicializar 
//Estas colecciones son m[as r[apidas pero tienen limitaciones


//linkedList trabaja mas rápido es doblemente enlazado sabe que esta antes y que esta después