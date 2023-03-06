package Prac_Here_1;

public class Repartidor extends Empleados {

	private String zona;

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param zona
	 */
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repartidor [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", zona=");
		builder.append(zona);
		builder.append("]");
		return builder.toString();
	}

	public void plusE() {
		if (this.edad < 25 && this.zona.equals("zona 3"))
			this.salario += this.PLUS;
	}

}
