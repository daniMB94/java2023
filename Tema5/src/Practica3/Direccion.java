package Practica3;

public class Direccion {

	private enum TipoVia {CALLE, AVENIDA, BARRIADA, PARAJE, PLAZA, URBANIZACIÓN}
	
	private String nombreVia;
	private int numero;
	private String poblacion;
	private String provincia;
	private String cp;
	private String pais;
	private double latitud;
	private double longitud;
	
	//CONSTRUCTOR PARAMETRIZADO
	/**
	 * @param nombreVia
	 * @param numero
	 * @param poblacion
	 * @param provincia
	 * @param cp
	 * @param pais
	 * @param latitud
	 * @param longitud
	 */
	public Direccion(String nombreVia, int numero, String poblacion, String provincia, String cp, String pais,
			double latitud, double longitud) {
		super();
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	//CONSTRUCTOR COPIA
	
	public Direccion(Direccion otra) {
		this.nombreVia = otra.nombreVia;
		this.numero = otra.numero;
		this.cp = otra.cp;
		this.poblacion = otra.poblacion;
		this.pais = otra.pais;
		this.latitud = otra.latitud;
		this.longitud = otra.longitud;
		this.provincia = otra.provincia;
	}
	
	//GETTERS

	/**
	 * @return the nombreVia
	 */
	public String getNombreVia() {
		return nombreVia;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}
	
	//SETTERS String nombreVia, int numero, String poblacion, String provincia, String cp, String pais,
	//double latitud, double longitud
	public void nombreVia(String nombreVia) {
		boolean error = true;
		while(error = true) {
			try {
				this.nombreVia = nombreVia;
				error = false;
			} catch (Exception e) {
				error = true;
			}
		}
		
	}
}
