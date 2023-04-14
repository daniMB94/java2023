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
		sc.close();
	}
	//Se usará para crear una clase para usar el método y evitar que se vuelvan a pedir 4 números
	public OrdenacionListas(Integer i1) {
		super();
		this.cola = new LinkedList<>(Arrays.asList(i1));
	}
	
	
	public LinkedList<Integer> OrdenacionMezcla(Queue<Integer> c1, Queue<Integer> c2){
		
		
		while(!c1.isEmpty() && !c2.isEmpty()) {

			if(c1.peek() <= c2.peek())
				colaGeneral.add(c1.poll());
			else
				colaGeneral.add(c2.poll());
		}
		if(c1.isEmpty())
			if(c2.isEmpty())
				return colaGeneral;
			else {
				while(!c2.isEmpty())
				colaGeneral.add(c2.poll());
			}
		else
			while(!c1.isEmpty()) {
				colaGeneral.add(c1.poll());
			}
				
		return colaGeneral;
	}
	
	
	}
	
	

