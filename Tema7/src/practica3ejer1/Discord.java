package practica3ejer1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import practica3ejer1.Gamer.Nivel;

public class Discord {

	private HashSet gamers;

	public Discord() {
		super();
		// Método loadGamers
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

		builder.append(gamers);

		return builder.toString();
	}

	/**
	 * Aniade g al HashSet gamers de la clase Discord
	 * 
	 * @param g
	 */
	public void addGamer(Gamer g) {

		this.gamers.add(g);
	}

	/**
	 * Elimina g del HashSet gamers de la clase Discord. Devuelve true si lo ha
	 * eliminado o false si no lo ha eliminado
	 * 
	 * @param g
	 * @return
	 */
	public boolean removeGamer(Gamer g) {

		return this.gamers.remove(g);

	}

	/**
	 * Este método se utilizará en el constructor de Discord para, a su vez, llamar
	 * al constructor de gamer y que se creen tantos objetos gamer como líneas tenga
	 * el archivo de texto del parámetro f1 Estas líneas tendrán la información
	 * necesaria para crear objetos Gamer
	 * 
	 * @param f1
	 * @return
	 */
	public boolean loadGamers(Path f1) {
		boolean exitoLectura = false;

		try {
			List<String> lineas = Files.readAllLines(f1);

			this.gamers = (HashSet) lineas.stream().map(linea -> {
				String[] atributos = linea.split(";");
				return new Gamer(atributos[0], atributos[1], atributos[2], Nivel.valueOf(atributos[3]));
			}).collect(Collectors.toSet());

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
	 * 
	 * @param g
	 * @return
	 */
	public boolean findGamer(Gamer g) {
		return this.gamers.contains(g);
	}

	/**
	 * Devuelve un String con la información de todos los Gamers
	 * 
	 * @return
	 */
	public String listGamers() {

		return this.gamers.toString();

	}

	/**
	 * Guarda la información del ArrayList en el fichero gamers.txt. Lo sobreescribe
	 * @param uri
	 */
	public void saveGamers(Path uri) {

		ArrayList<Gamer> listaGamer = (ArrayList<Gamer>) this.gamers.stream().collect(Collectors.toList());

		List<String> listadoAtributos = (List<String>) listaGamer.stream()
				.map(g -> g.getNick() + ";" + g.getEmail() + ";" + g.getJuego() + ";" + g.getNivel().toString())
				.collect(Collectors.toList());

		try {
			Files.write(uri, listadoAtributos, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
