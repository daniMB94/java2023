package practica3ejer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Discord {

	private HashSet gamers;
	
	public Discord() {
		super();
		//Método loadGamers
		this.gamers = new HashSet<>();
	}

	public HashSet getGamers() {
		return gamers;
	}

	public void setGamers(HashSet gamers) {
		this.gamers = gamers;
	}
	
	public void addGamer(Gamer g) {
		this.gamers.add(g);
	}
	public void removeGamer(Gamer g) {
		this.gamers.remove(g);
	}
	
	/**
	 * Este método se utilizará en el constructor de Discord para, a su vez, llamar al constructor de gamer y que se creen tantos objetos gamer como líneas tenga el archivo de texto del parámetro f1
	 * Estas líneas tendrán la información necesaria para crear objetos Gamer
	 * @param f1
	 * @return
	 */
	public boolean loadGamers(Path f1) {
		boolean exitoLectura = false;
		
		try {
			BufferedReader br = Files.newBufferedReader(f1);
			//Llamar al constructor de Gamer para crear un objeto Gamer por cada fila de texto del archivo que se está leyendo
			
			exitoLectura = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			exitoLectura = false;
		}
		
		return exitoLectura;
	}
	
	/**
	 * Devuelve true si el objeto se encuentra dentro del conjunto de Gamers
	 * @param g
	 * @return
	 */
	public boolean findGamer(Gamer g) {
		return this.gamers.contains(g);
	}
	/**
	 * Devuelve un String con la información de todos los Gamers
	 * @return
	 */
	public String listGamers(){
		String infoGamer;
		
		return infoGamer = this.gamers.stream()
						.toString();
					
	}
	
}
