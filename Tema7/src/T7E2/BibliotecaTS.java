package T7E2;

import java.util.ArrayList;

public class BibliotecaTS {

	private ArrayList<Publicacion> publicaciones;

	private String direccion;

	/**
	 * @param publicacion
	 * @param direccion
	 */
	public BibliotecaTS(String direccion) {
		super();
		this.direccion = direccion;
		this.publicaciones = new ArrayList<>();
	}

	/**
	 * @return the publicaciones
	 */
	public ArrayList<Publicacion> getPublicacion() {
		return publicaciones;
	}

	/**
	 * @param publicacion the publicaciones to set
	 */
	public void setPublicacion(ArrayList<Publicacion> publicacion) {
		this.publicaciones = publicacion;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// METODOS
	public void adquirirMaterial(Publicacion p) {
		this.publicaciones.add(p);
	}

	public Publicacion buscar(String titulo) {
		for (Publicacion p : publicaciones) {
			if (p.getTitulo().toString().equals(titulo))
				return p;

		}
		return null;

	}

	public String buscar(Autor a) {

		ArrayList<Publicacion> publicacionesAutor = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (Publicacion p : publicaciones) {

			if (p.getAutores().indexOf(a) >= 0)
				publicacionesAutor.add(p);

		}

		for (Publicacion pa : publicacionesAutor) {
			sb.append(pa.toString());
			sb.append("\n");
		}

		return sb.toString();
	}

}
