package T7E3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Agenda {

	// ATRIBUTOS
	private TreeMap<String, String> contactos;
	private int totales;

	/**
	 * @param contactos
	 */
	// CONSTRUCTOR
	public Agenda() {
		super();
		this.contactos = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.compareTo(o2);
			}

		});
	}
	//GETTERS Y SETTERS
	public TreeMap<String, String> getContactos() {
		return contactos;
	}

	public void setContactos(TreeMap<String, String> contactos) {
		this.contactos = contactos;
	}
	
	//METODOS

	public void addContacto(String nombre, String tlf) {
		this.contactos.put(nombre, tlf);
	}

	public StringBuffer listarContactos() {
		StringBuffer sb = new StringBuffer();
		String tlf = "***CONTACTOS GUARDADOS***";
		Set<String> clavesRecorrer = this.contactos.keySet();
		for (String k : clavesRecorrer) {
			sb.append(k + " - ");

			tlf = this.contactos.get(k);
			sb.append(tlf + "\n");

		}
		return sb;
	}

	public int totalContactos() {
		return this.contactos.size();
	}

	
}
