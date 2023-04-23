package practica2ejer1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio1 {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG", "In", "The", "Street");
		
		lista.stream()
			.map(c -> c.toLowerCase())
			.forEach(System.out::println);
		
		System.out.println("---------------------");
		
		lista.stream()
			.filter(c -> c.length() > 3)
			.map(c -> c.toLowerCase())
			.forEach(System.out::println);
	
		System.out.println("---------------------");

		lista.stream()
			.filter(c -> c.length() > 3)
			.map(c -> c.toLowerCase())
			.skip(2)
			.limit(3)
			.forEach(System.out::println);
	
		System.out.println("---------------------");

		lista.stream()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println("---------------------");

		System.out.println(lista.stream()
								.filter(c -> c.length() > 4)
								.count());
		
		System.out.println("---------------------");
		
		System.out.println(lista.stream()
								.reduce((a,b) -> a.concat("-").concat(b))
								.get());
		
		System.out.println("---------------------");
		
		lista.stream()
			.filter(c -> c.contains("O"))
			.limit(1)
			.forEach(System.out::println);
			
	}

}
