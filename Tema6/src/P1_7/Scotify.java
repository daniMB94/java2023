package P1_7;

import java.util.ArrayList;

public class Scotify {

	private ArrayList<Multimedia> elementosMultimedia;
	
	public Scotify() {
		this.elementosMultimedia = new ArrayList<>();
	}
	
	public void addMultimedia(Multimedia m) {
		this.elementosMultimedia.add(m);
	}
	
	public Multimedia buscarMultimedia(String nombreMultimedia) {
		for(Multimedia m : elementosMultimedia) {
			if(m.getNombre().toString().equals(nombreMultimedia))
				return m;
		}
			return null;
	}
	
	public void eliminarMultimedia(int posicion) {
		this.elementosMultimedia.remove(posicion);
	}
	
}
