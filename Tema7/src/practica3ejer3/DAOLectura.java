package practica3ejer3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DAOLectura {

	private Set<Lectura> lecturas;

	public DAOLectura() {
		super();
		this.lecturas = new HashSet<>();
		cargarDatos();
	}

	public Set<Lectura> getLecturas() {
		return lecturas;
	}

	/**
	 * Lee un archivo de texto separado por coma y va creando objetos de cada linea
	 * utilizando un stream que separa los atributos y llama al constructor
	 */
	public void cargarDatos() {

		Path ruta = Paths.get("src/resources/lecturas.csv");

		try {
			List<String> listadoLecturas = Files.readAllLines(ruta);
			this.lecturas = (HashSet) listadoLecturas.stream().map(linea -> {
				String[] atributos = linea.split(",");

				return new Lectura(Double.parseDouble(atributos[0]), Double.parseDouble(atributos[1]),
						LocalDate.parse(atributos[2]), DAOFinca.findById(Integer.parseInt(atributos[3])));

			}).collect(Collectors.toSet());
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
		List<String> atributosLecturas = listadoLecturas.stream().map(Lectura::atributos).toList();
		try {
			Files.write(ruta, atributosLecturas, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			System.out.println("Error al grabar los datos al fichero csv");
		}
	}

	/**
	 * Aniade una lectura al HashSet lecturas
	 * 
	 * @param l
	 */
	public void addLectura(Lectura l) {
		this.lecturas.add(l);
	}

	/**
	 * Elimina una lectura del HashSet lecturas
	 * 
	 * @param l
	 */
	public void deleteLectura(Lectura l) {
		this.lecturas.remove(l);
	}

	/**
	 * Devuelve las lecturas por su ciudad
	 */
	public void getLecturasPorCiudad() {
		Map<Finca, List<Lectura>> lecturasPorCiudad = this.lecturas.stream()
				.collect(Collectors.groupingBy(Lectura::getFinca));

		System.out.println(lecturasPorCiudad.toString());
	}

	/**
	 * Devuelve las lecturas por ciudad ordenadas por temperatura de máximas a mínimas
	 */
	public void getTempMaximaPorFinca() {
		this.lecturas.stream()
					.sorted(new Comparator<Lectura>() {

						@Override
						public int compare(Lectura o1, Lectura o2) {
							int t1 = (int) o1.getTemperatura();
							int t2 = (int) o2.getTemperatura();
							
							if( t2 > t1)
								return 1;
							else 
								if(t1 > t2)
									return -1;
								else
									return 0;
						}
						
					}).forEach(System.out::println);
					
	}
	
	/**
	 * Devuelve las lecturas por ciudad ordenadas por temperatura de mínimas a máximas
	 */
	public void getTemperaturaMínimaPorFinca() {
		this.lecturas.stream()
		.sorted(new Comparator<Lectura>() {

			@Override
			public int compare(Lectura o1, Lectura o2) {
				int t1 = (int) o1.getTemperatura();
				int t2 = (int) o2.getTemperatura();
				
				if( t1 > t2)
					return 1;
				else 
					if(t2 > t1)
						return -1;
					else
						return 0;
			}
			
		}).forEach(System.out::println);
	}


	
}
