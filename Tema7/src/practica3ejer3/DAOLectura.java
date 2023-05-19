package practica3ejer3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	public void cargarDatos() {

		Path ruta = Paths.get("src/resources/lecturas");

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		try {
			List<String> listadoLecturas = Files.readAllLines(ruta);
			this.lecturas = (HashSet) listadoLecturas.stream().map(linea -> {
				String[] atributos = linea.split(";");
				
				return new Lectura(Integer.parseInt(atributos[0]), Double.parseDouble(atributos[1]), Double.parseDouble(atributos[2]), LocalDateTime.parse(atributos[3], formato), new Finca(Integer.parseInt(atributos[4])));
						
			}).collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
