package T7E5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class OrdenacionListas {
	
	public static LinkedList<Integer> colaGeneral = new LinkedList<>();
	public Queue<Integer> cola;
	
	public OrdenacionListas() {
		super();
		Integer i1, i2, i3, i4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 4 numeros enteros ordenadamente: ");
		i1 = Integer.parseInt(sc.nextLine());
		i2 = Integer.parseInt(sc.nextLine());
		i3 = Integer.parseInt(sc.nextLine());
		i4 = Integer.parseInt(sc.nextLine());
		this.cola = new LinkedList<>(Arrays.asList(i1, i2, i3, i4));
	}
	//Se usará para crear una clase para usar el método y evitar que se vuelvan a pedir 4 números
	public OrdenacionListas(Integer i1) {
		super();
		this.cola = new LinkedList<>(Arrays.asList(i1));
	}
	
	
	public LinkedList<Integer> OrdenacionMezcla(Queue<Integer> c1, Queue<Integer> c2){
		
		// Mientras que la cola 1 y la cola 2 tengan elementos se entrará en el bucle y se hara una comparación para luego
		// hacer un poll del más bajo
		while(!c1.isEmpty() && !c2.isEmpty()) {

			if(c1.peek() <= c2.peek())
				colaGeneral.add(c1.poll());
			else
				colaGeneral.add(c2.poll());
		}
		
		// Posteriormente, si la cola 1 está vacía y la cola 2 está vacía se devolvera la colaGeneral
		if(c1.isEmpty())
			if(c2.isEmpty())
				return colaGeneral;
		// En caso contrario, mientras la cola 2 tenga elementos se irán añadiendo a la colaGeneral
			else {
				while(!c2.isEmpty())
				colaGeneral.add(c2.poll());
			}
		// Si la cola 1 no está vacía quiere decír que la cola 2 si lo estará. Por lo tanto habrá que añadir todos los
		// elementos de la cola 1 a la colaGeneral
		else
			while(!c1.isEmpty()) {
				colaGeneral.add(c1.poll());
			}
				
		return colaGeneral;
	}
	
	
	}
	
	

