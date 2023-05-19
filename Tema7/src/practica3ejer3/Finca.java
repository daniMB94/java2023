package practica3ejer3;

import java.util.Objects;

public class Finca {
	
	public static int idGeneral = 0;

	private int id;
	private String nombre;
	private long longitud;
	private long latitud;
	private double superficie;
	private String localidad;
	private String provincia;
	
	public Finca(String nombre, long longitud, long latitud, double superficie, String localidad, String provincia) {
		super();
		this.id = idGeneral++;
		this.nombre = nombre;
		this.longitud = longitud;
		this.latitud = latitud;
		this.superficie = superficie;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	//sobrecargamos el constructor para usarlo en DAOLectura en el método cargarDatos()
	public Finca(int id) {
		super();
		this.id = id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the longitud
	 */
	public long getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the latitud
	 */
	public long getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(long latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Finca other = (Finca) obj;
		return id == other.id;
	}
	
	
	
}
