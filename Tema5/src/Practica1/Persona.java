package Practica1;

import java.util.Objects;

public class Persona {

	enum sexo {
		H, M, O
	}

	private String nombre = "";
	private int edad = 0;
	private String DNI = "";
	private double peso = 0;
	private double altura = 0;
	private sexo sexoP = sexo.H;

	// CONSTRUCTORES
	/*
	 * Constructor por defecto
	 */
	public Persona() {
		super();

	}

	/*
	 * Constructor con algunos parametro y otros por defecto
	 */
	/**
	 * @param nombre
	 * @param edad
	 * @param dNI
	 */
	public Persona(String nombre, int edad, String dNI) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexoP = sexo.H;
	}

	/*
	 * Constructor parametrizado
	 */
	/**
	 * @param nombre
	 * @param edad
	 * @param dNI
	 * @param peso
	 * @param altura
	 * @param sexoP
	 */
	public Persona(String nombre, int edad, String dNI, double peso, double altura, Persona.sexo sexoP) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.peso = peso;
		this.altura = altura;
		this.sexoP = sexoP;
	}

	// Constructor copia

	public Persona(Persona otraPersona) {
		this.altura = otraPersona.altura;
		this.DNI = otraPersona.DNI;
		this.edad = otraPersona.edad;
		this.nombre = otraPersona.nombre;
		this.peso = otraPersona.peso;
		this.sexoP = otraPersona.sexoP;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the sexoP
	 */
	public sexo getSexoP() {
		return sexoP;
	}

	/**
	 * @param sexoP the sexoP to set
	 */
	public void setSexoP(sexo sexoP) {
		this.sexoP = sexoP;
	}
	
	
	
	// METODOS

	public int calculaIMC() {
		double pesoIdeal = this.peso / Math.pow(this.altura, 2);
		if (pesoIdeal < 20)
			return 1;
		else if (pesoIdeal > 25)
			return -1;
		else
			return 0;
	}

	public boolean esMayordeEdad() {

		if (this.edad > 18)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", DNI=");
		builder.append(DNI);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", sexoP=");
		builder.append(sexoP);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI, altura, edad, nombre, peso, sexoP);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(DNI, other.DNI)
				&& Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso) && sexoP == other.sexoP;
	}
	
	
}
