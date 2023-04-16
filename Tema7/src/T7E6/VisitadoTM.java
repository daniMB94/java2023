package T7E6;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class VisitadoTM {

	public TreeMap<String, List<String>> tmVisitado;

	public VisitadoTM() {
		super();
		this.tmVisitado = new TreeMap<>(Comparator.reverseOrder());
	}


	
	
}
