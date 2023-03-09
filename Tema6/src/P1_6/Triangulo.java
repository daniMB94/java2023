package P1_6;

import java.util.Objects;

public abstract class Triangulo implements Comparable {

	protected double lado1;
	protected double lado2;
	protected double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		if(!this.valido()) throw new IllegalArgumentException("No se puede crear un triangulo con esos lados");
	}

	public Triangulo() {
		super();
		this.lado1 = 1;
		this.lado2 = 1;
		this.lado3 = 1;
	}
	
	public Triangulo(Triangulo otroTriangulo) {
		super();
		this.lado1 = otroTriangulo.lado1;
		this.lado2 = otroTriangulo.lado2;
		this.lado3 = otroTriangulo.lado3;
	}

	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * @return the lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lado1, lado2, lado3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		return Double.doubleToLongBits(lado1) == Double.doubleToLongBits(other.lado1)
				&& Double.doubleToLongBits(lado2) == Double.doubleToLongBits(other.lado2)
				&& Double.doubleToLongBits(lado3) == Double.doubleToLongBits(other.lado3);
	}
	
	//METODOS
	
	public abstract double area();
	
	public abstract boolean valido();
	
	public int compareTo(double area) {
		if(this.area() > area)
			return 1;
		else if(this.area() < area)
			return -1;
		else
			return 0;
	}
	
	public double perimetro() {
		double perimetro = 0;
		perimetro = this.lado1 + this.lado2 + this.lado3;
		return perimetro;
	}
	
	
}
