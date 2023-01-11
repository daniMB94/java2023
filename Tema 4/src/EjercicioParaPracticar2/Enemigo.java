package EjercicioParaPracticar2;

import java.lang.Math;

public class Enemigo {
	
	private String nombre;
	private String tipo;
	private int salud;
	private int nivel;
	private int damage;
	
	/*
	 * CONSTRUCTOR POR DEFECTO
	 */
	
	public Enemigo(String nombre, String tipo, int damage) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.salud = 100;
		this.nivel = 1;
		this.damage = damage;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void subirNivelSalud() {
		 this.nivel = this.nivel + 1;
		 this.salud = this.salud + (int) (Math.pow(2, this.nivel));
	}
	
	public void recibirDamage(int danio) {
		this.salud = this.salud - damage;
		if(this.salud <= 0) {
			System.out.println("Enemigo muerto");
		}
	}

}
