package practica3ejer3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DAOFinca {

	private static ArrayList<Finca> fincas;

	public DAOFinca() {
		super();
		fincas = new ArrayList<>();
		cargarDatos();

	}
	/**
	 * Carga los datos contenidos en un archivo csv al ArrayList fincas
	 */
	public void cargarDatos() {

		Path ruta = Paths.get("src/resources/fincas");

		try {
			List<String> listadoFincas = Files.readAllLines(ruta);
			fincas = (ArrayList) listadoFincas.stream().map(linea -> {
				String[] atributos = linea.split(";");

				return new Finca(atributos[0], Long.parseLong(atributos[1]), Long.parseLong(atributos[2]),
						Double.parseDouble(atributos[3]), atributos[4], atributos[5]);
			}).collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * Busca una finca a través de un id pasado por parámetro
	 * @param id
	 * @return
	 */
	public static Finca findById(int id) {

	    for (Finca f :fincas) {
	        if (f.getId() == id) {
	            return f;
	        }
	    }
	    return null;
		
	}
	
	/**
	 * Aniade una finca al ArrayList de fincas
	 * @param f
	 * @return
	 */
	public boolean addFinca(Finca f) {
		
		return fincas.add(f);
		
	}
	/**
	 * Elimina una finca del ArrayList de fincas
	 * @param f
	 * @return
	 */
	public boolean deleteFinca(Finca f) {
		
		if(fincas.indexOf(f) < 0)
			return false;
		else {
			fincas.remove(fincas.indexOf(f));
			return true;
		}
			
	}
	/**
	 * Encuentra una finca de manera eficiente pasándole su nombre como parámetro
	 * @param nombre
	 * @return
	 */
	public Finca findByNombre(String nombre) {
		fincas.sort(new Comparator<Finca>() {

			@Override
			public int compare(Finca o1, Finca o2) {
				
				return o1.getNombre().compareTo(o2.getNombre());
			}
			
		});
		
		int posicion = Collections.binarySearch((List)fincas, new Finca(nombre, 0, 0,  0, "", ""));
		
		if(posicion >= 0)
			return fincas.get(posicion);
		else
			return null;
		
	}
	/**
	 * Devuelve todas las fincas ordenadas de menor a mayor
	 */
	public void getFincasPorSuperficie() {
		this.fincas.stream()
					.sorted((f1, f2) -> (int) f1.getSuperficie() - (int) f2.getSuperficie())
					.forEach(System.out::println);
	}
	
	/**
	 * Devuelve las 3 fíncas más grandes
	 */
	public void getMasGrandes()	{
		this.fincas.stream()
					.sorted((f1, f2) -> (int) f1.getSuperficie() - (int) f2.getSuperficie())
					.limit(3)
					.forEach(System.out::println);
	}
	
	public void getFincasPorCiudad() {
		Map<String, List<Finca>> fincasPorCiudad = this.fincas.stream()
					.collect(Collectors.groupingBy(Finca::getLocalidad));
		
		System.out.println(fincasPorCiudad);
	}
}
