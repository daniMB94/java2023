package T7E5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class OrdenacionListas {
	
	public Queue cola;
	public LinkedList<Integer> colaGeneral;
	
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
		this.colaGeneral = new LinkedList<>();
	}
	
	public LinkedList<Integer> OrdenacionMezcla(Queue<Integer> c1, Queue<Integer> c2){
		
		for(int i = 0; i < c1.size(); i++) {
			
		}
		
		return this.colaGeneral;
	}
	
	}
	
	

