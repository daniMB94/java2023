package Prac_Here_1;

public class Comercial extends Empleados {

	private double comision;

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param comision
	 */
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	/**
	 * @return the comision
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * @param comision the comision to set
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comercial [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", comision=");
		builder.append(comision);
		builder.append("]");
		return builder.toString();
	}

	public void plusE() {
		if (this.edad > 30 && this.comision > 200)

			this.salario += this.PLUS;
	}
}
