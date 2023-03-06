package Practica3;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Direccion {

	private enum TipoVia {
		CALLE, AVENIDA, BARRIADA, PARAJE, PLAZA, URBANIZACIÓN, CARRETERA, RAMBLA
	}

	// CREAMOS DOS ATRIBUTOS ESTATICOS PARA USAR EN LOS SETTERS Y COMPROBAR QUE NO
	// SE INTRODUCEN DIGITOS EN DETERMINADOS ATRIBUTOS
	private static Pattern numeros = Pattern.compile(".*[0-9].*");
	private static Pattern letras = Pattern.compile(".*[a-zA-Z].*");

	private String nombreVia;
	private int numero;
	private String poblacion;
	private String provincia;
	private String cp;
	private String pais;
	private double latitud;
	private double longitud;
	private TipoVia tipoVia;

	// CONSTRUCTOR PARAMETRIZADO
	/**
	 * @param nombreVia
	 * @param numero
	 * @param poblacion
	 * @param provincia
	 * @param cp
	 * @param pais
	 * @param latitud
	 * @param longitud
	 * @param tipoVia
	 */
	public Direccion(String nombreVia, int numero, String poblacion, String provincia, String cp, String pais,
			double latitud, double longitud, TipoVia tipoVia) {
		super();
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipoVia = tipoVia;
	}

	// CONSTRUCTOR COPIA

	public Direccion(Direccion otra) {
		super();
		this.nombreVia = otra.nombreVia;
		this.numero = otra.numero;
		this.cp = otra.cp;
		this.poblacion = otra.poblacion;
		this.pais = otra.pais;
		this.latitud = otra.latitud;
		this.longitud = otra.longitud;
		this.provincia = otra.provincia;
		this.tipoVia = otra.tipoVia;
	}

	// CONSTRUCTOR POR DEFECTO

	public Direccion() {
		super();
		this.nombreVia = null;
		this.numero = 0;
		this.cp = null;
		this.poblacion = null;
		this.pais = null;
		this.latitud = 37.29636;
		this.longitud = -1.87997;
		this.provincia = null;
		this.tipoVia = TipoVia.CALLE;
	}

	// GETTERS

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

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	// SETTERS CON LANZAMIENTO DE EXCEPCIONES Y COMPROBANCO QUE EN CIERTOS ATRIBUTOS
	// NO HAYA CARACTERES NUMÉRICOS O ALFABÉTICOS

	public void setNombreVia() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		String nombreVia;
		while (error == true) {
			try {
				System.out.println("Introduce el nombre de la via: ");
				nombreVia = sc.nextLine();
				Matcher encontrar = numeros.matcher(nombreVia);
				if (encontrar.matches()) {
					System.out.println("Solo se admiten letras");
					error = true;
				} else {
					this.nombreVia = nombreVia;
					error = false;
				}

			} catch (Exception e) {
				error = true;
			}
		}

	}

	public void setNumero() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		int numero;
		while (error == true) {
			try {
				System.out.println("Introduce el numero de la dirección: ");
				numero = Integer.parseInt(sc.nextLine());
				this.numero = numero;
				error = false;
			} catch (Exception e) {
				System.out.println("Solo se admiten numeros");
				error = true;
			}
		}
	}

	public void setPoblacion() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		String poblacion;
		while (error == true) {
			try {
				System.out.println("Introduce la población: ");
				poblacion = sc.nextLine();
				Matcher encontrar = numeros.matcher(poblacion);
				if (encontrar.matches()) {
					System.out.println("Error: no puedes introducir numeros");
					error = true;
				} else {
					this.poblacion = poblacion;
					error = false;
				}

			} catch (Exception e) {
				error = true;
			}
		}

	}

	public void setProvincia() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		String provincia;
		while (error == true) {
			try {
				System.out.println("Introduce la provincia: ");
				provincia = sc.nextLine();
				Matcher encontrar = numeros.matcher(provincia);
				if (encontrar.matches()) {
					System.out.println("Error: no puedes introducir numeros");
					error = true;
				} else {
					this.provincia = provincia;
					error = false;
				}

			} catch (Exception e) {
				error = true;
			}
		}

	}

	public void setCp() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		String cp;
		while (error == true) {
			try {
				System.out.println("Introduce el código postal: ");
				cp = sc.nextLine();
				Matcher encontrar = letras.matcher(cp);
				if (encontrar.matches()) {
					System.out.println("Error: no puedes introducir letras");
					error = true;
				} else {
					this.cp = cp;
					error = false;
				}

			} catch (Exception e) {
				error = true;
			}
		}

	}

	public void setPais() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		String pais;
		while (error == true) {
			try {
				System.out.println("Introduce el país: ");
				pais = sc.nextLine();
				Matcher encontrar = numeros.matcher(pais);
				if (encontrar.matches()) {
					System.out.println("Error: no puedes introducir numeros");
					error = true;
				} else {
					this.pais = pais;
					error = false;
				}

			} catch (Exception e) {
				error = true;
			}
		}

	}

	public void setLatitud() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);

		while (error == true) {
			try {
				System.out.println("Introduce la latitud: ");
				this.latitud = Double.parseDouble(sc.nextLine());

				error = false;
			} catch (Exception e) {
				System.out.println("Solo se admiten numeros");
				error = true;
			}
		}
	}

	public void setLongitud() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);

		while (error == true) {
			try {
				System.out.println("Introduce la longitud: ");
				this.longitud = Double.parseDouble(sc.nextLine());

				error = false;
			} catch (Exception e) {
				System.out.println("Solo se admiten numeros");
				error = true;
			}
		}
	}

	public void setTipoVia() {
		boolean error = true;
		Scanner sc = new Scanner(System.in);
		while (error == true) {
			try {
				System.out.println("Introduce el tipo de vía: ");
				this.tipoVia = TipoVia.valueOf(sc.nextLine().toUpperCase());
				error = false;
			} catch (Exception e) {
				System.out.println("Escribe alguno de estos tipos: CALLE, AVENIDA, BARRIADA, PARAJE, PLAZA, URBANIZACIÓN, CARRETERA, RAMBLA");
				error = true;
			}
		}


	}

	// METODOS
	public double distanciaKM(Direccion otra) {
		double R = 6371;
		double difLatitud = Math.toRadians(this.latitud) - Math.toRadians(otra.latitud);
		double difLongitud = Math.toRadians(this.longitud) - Math.toRadians(otra.longitud);
		double a = Math.sin(difLatitud / 2) * 2
				+ Math.cos(otra.latitud) * Math.cos(this.latitud) * Math.sin(difLongitud / 2) * 2;
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distanciaKM = R * c;
		return distanciaKM;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [nombreVia=");
		builder.append(nombreVia);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", cp=");
		builder.append(cp);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append(", tipoVia=");
		builder.append(tipoVia);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}
}
