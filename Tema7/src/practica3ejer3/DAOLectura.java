package practica3ejer3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DAOLectura {
	
	private Set<Lectura> lecturas;
	
	public DAOLectura() {
		super();
		this.lecturas = new HashSet<>();
		cargarDatos();
	}
	
	/*Le pasamos un DAOFinca para poder incluir en el constructor la finca correspondiente buscando por id*/

	/**
	 * Lee un archivo de texto separado por coma y va creando objetos de cada linea utilizando un stream que separa los atributos y llama al constructor
	 */
	public void cargarDatos() {

		Path ruta = Paths.get("src/resources/lecturas.csv");

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/M/yyyy");
		
		
		try {
			List<String> listadoLecturas = Files.readAllLines(ruta);
			this.lecturas = (HashSet) listadoLecturas.stream().map(linea -> {
				String[] atributos = linea.split(",");
				
				return new Lectura(Integer.parseInt(atributos[0]), Double.parseDouble(atributos[1]), Double.parseDouble(atributos[2]), LocalDateTime.parse(atributos[3], formato), DAOFinca.findById(Integer.parseInt(atributos[4])));
						
			}).collect(Collectors.toList());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	/**
	 * Graba la información de los lecturas guardadas en el HashSet lecturas 
	 */
	public void grabarDatos() {
		Path ruta = Paths.get("src/resources/lecturas.csv");
		
		List<Lectura> listadoLecturas = this.lecturas.stream().collect(Collectors.toList());
		List<String> atributosLecturas = listadoLecturas.stream()
														.map(Lectura::atributos)
														.toList();
		try {
			Files.write(ruta, atributosLecturas, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			System.out.println("Error al grabar los datos al fichero csv");
		}
	}
	/**
	 * Aniade una lectura al HashSet lecturas
	 * @param l
	 */
	public void addLectura(Lectura l) {
		this.lecturas.add(l);
	}
	
	/**
	 * Elimina una lectura del HashSet lecturas
	 * @param l
	 */
	public void deleteLectura(Lectura l) {
		this.lecturas.remove(l);
	}
}
