package OrdenarLibro;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaSet {

	public static void main(String[] args) {
		
		//TreeSet con Comparator
		
				Libro l1 = new Libro("disok", "ISBN1", 389);
				Libro l2 = new Libro("diwojd", "ISBN2", 123);
				Libro l3 = new Libro("fodsl", "ISBN3", 512);
				Libro l4 = new Libro("akle", "ISBN4", 23);
				Libro l5 = new Libro("oejd", "ISBN5", 643);
				Libro l6 = new Libro("gopes", "ISBN6", 213);
				
				Set<Libro> libros = new TreeSet<>( new Comparator<Libro>() {
					@Override
					public int compare(Libro o1, Libro o2) {
						return o1.getTitulo().compareTo(o2.getTitulo());
					}
					
				}); 
				
				libros.add(l1);
				libros.add(l2);
				libros.add(l3);
				libros.add(l4);
				libros.add(l5);
				libros.add(l6);
				libros.add(l1);
				
				/*String letrasTitulo = "abcdefghijklmenopqrstuvwxyz";
				StringBuffer titulo = null;
				for(int i = 0; i < 10; i++) {
					
					
					for(int j = 0; j < 5; j++) {
						titulo.append(letrasTitulo.charAt((int)Math.random()*((letrasTitulo.length()+1)-0))+0);
					}
					
				
					
				}*/
				
				for(Libro l: libros) {
					System.out.println(l);
				}
		
	}
	
}
