package T7E6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VisitadoHM {

	public static HashMap<String, List<String>> hmVisitados;

	public VisitadoHM() {
		super();
		this.hmVisitados = new HashMap<>();
	}
	
	//MÉTODOS
	
	public List<String> addPais(String pais) {
		
		if(hmVisitados.containsKey(pais)) {
			return null;
		} else
			return hmVisitados.put(pais, new ArrayList<String>());
		
	}
	
	public boolean addCiudad(String pais, String ciudad) {
		
		return hmVisitados.get(pais).add(ciudad);
		
	}
	
	public StringBuffer mostrarVisitados() {
		
		StringBuffer sb = new StringBuffer();
		
		for(String pais : hmVisitados.keySet()) {
			
			sb.append(pais + ":\n");
			
			for(String ciudad : hmVisitados.get(pais)) {
				sb.append("\t\t+" + ciudad + "\n");
			}
				
		}
		
		return sb;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VisitadoHM []");
		return builder.toString();
	}
	

	
	
}
