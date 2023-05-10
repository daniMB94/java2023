package practica3ejer1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

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
	public boolean removeGamer(Gamer g) {
		return this.gamers.remove(g);
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
	
	public void saveGamers(String uri) {
		//Fichero a leer
		Path f1 = Paths.get(uri);
		//Fichero a escribir
		Path f2 = Paths.get(uri);
		
		
		try {
			//Obtenemos BufferedReader para el fichero a leer
			BufferedReader br = Files.newBufferedReader(f1);
			
			//Obtenemos BufferedReader para el fichero a escribir
			BufferedWriter bw = Files.newBufferedWriter(f2);
			
			String informacion = listGamers();
			while((informacion = br.readLine()) != null) {
				bw.write(informacion);
				bw.newLine();
			}
			bw.close();
			br.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
