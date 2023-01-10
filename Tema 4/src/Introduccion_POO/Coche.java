package Introduccion_POO;

public class Coche {
	
	/*
	 * PROPIEDADES
	 */
	
	public String marca;
	public String modelo;
	public String color;
	public double precio;
	
	/*
	 * CONSTRUCTOR
	 */
	
	public Coche(String marca, String modelo, String color, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/*
	 * METODOS - COMPORTAMIENTO
	 */
	
	public boolean vender() {
		if(this.precio > 10000) {
			return true;
		}
	}
	//COMENT	
	public String pintar() {
		String cocheStr= "";
		cocheStr = this.marca + "-" + this.modelo + "-" + this.color;
	}
}
