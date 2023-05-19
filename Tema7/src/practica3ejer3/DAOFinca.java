package practica3ejer3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DAOFinca {

	private ArrayList<Finca> fincas;

	public DAOFinca() {
		super();
		this.fincas = new ArrayList<>();
		cargarDatos();

	}

	public void cargarDatos() {

		Path ruta = Paths.get("src/resources/fincas");

		try {
			List<String> listadoFincas = Files.readAllLines(ruta);
			this.fincas = (ArrayList) listadoFincas.stream().map(linea -> {
				String[] atributos = linea.split(";");

				return new Finca(atributos[0], Long.parseLong(atributos[1]), Long.parseLong(atributos[2]),
						Double.parseDouble(atributos[3]), atributos[4], atributos[5]);
			}).collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Finca findById(int id) {

	    for (Finca f :this.fincas) {
	        if (f.getId() == id) {
	            return f;
	        }
	    }
	    return null;
		
	}
	public boolean addFinca(Finca f) {
		
		return this.fincas.add(f);
		
	}
	public boolean deleteFinca(Finca f) {
		
		if(this.fincas.indexOf(f) < 0)
			return false;
		else {
			this.fincas.remove(this.fincas.indexOf(f));
			return true;
		}
			
	}
	public Finca findByNombre(String nombre) {
		this.fincas.sort(new Comparator<Finca>() {

			@Override
			public int compare(Finca o1, Finca o2) {
				
				return o1.getNombre().compareTo(o2.getNombre());
			}
			
		});
		
		int posicion = Collections.binarySearch((List)this.fincas, new Finca(nombre, 0, 0,  0, "", ""));
		
		if(posicion >= 0)
			return this.fincas.get(posicion);
		else
			return null;
		
	}

}
