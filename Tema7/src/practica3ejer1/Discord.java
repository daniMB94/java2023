package practica3ejer1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import practica3ejer1.Gamer.Nivel;

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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Discord [gamers=");
		builder.append(gamers);
		builder.append("]");
		return builder.toString();
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
			List<String> lineas = Files.readAllLines(f1);
			Set<Gamer> gamers = new HashSet<>();
			
			gamers = lineas.stream()
				.map(linea -> {
						String[] atributos = linea.split(";");
						return new Gamer(atributos[0], atributos[1], atributos[2], Nivel.valueOf(atributos[3]));
				})
				.collect(Collectors.toSet());
			
			this.setGamers(getGamers());
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
		String infoGamer = null;
		
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
