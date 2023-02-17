package Practica7;

import java.util.ArrayList;

public class Agenda {

	// ATRIBUTOS
	private ArrayList<Contacto> contactos;

	/**
	 * @param contactos
	 */
	// CONSTRUCTOR
	public Agenda() {
		super();
		this.contactos = new ArrayList<>();
	}

	// METODOS
	protected boolean existeContacto(Contacto c) {
		int contador = 0;
		for (Contacto contacto : contactos) {
			if (contacto.getTelefono().equals(c.getTelefono())) {
				contador = 1;
			}

		}
		if (contador == 0)
			return false;
		else
			return true;

	}

	protected void addContacto(Contacto c) {
		contactos.add(c);
	}

	protected void listarContactos() {
		for (Contacto contacto : contactos) {
			System.out.println(contacto.toString());
		}
	}

	protected void buscarContacto(String nombre) {
		int contador = 0;
		for (Contacto contacto : contactos) {
			if (contacto.getNombre().equals(nombre)) {
				System.out.println(contacto.getTelefono());
				contador++;
			}

		}
		if (contador == 0)
			System.out.println("Contacto inexistente");
	}

	protected void eliminarContacto(Contacto c) {
		contactos.remove(c);
	}
	
	protected Contacto obtenerContacto(int posicionContacto) {
		return contactos.get(posicionContacto);
		
	}
}
