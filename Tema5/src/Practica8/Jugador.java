package Practica8;

import java.util.Scanner;

public class Jugador {

	// ATRIBUTOS
	enum Clase {
		MAGO, CABALLERO, BARBARO, ELFO, ENANO, HOBBIT
	}

	private String nick;
	private double salud;
	private Clase clase;
	private Arma arma;

	// CONSTRUCTOR
	/**
	 * @param nick
	 * @param salud
	 * @param clase
	 */
	public Jugador(String nick, double salud, Clase clase) {
		super();
		this.nick = nick;
		this.salud = salud;
		this.clase = clase;
		this.arma = new Arma();
	}

	// GETTERS Y SETTERS
	/**
	 * @return the arma
	 */
	public Arma getArma() {
		return arma;
	}

	/**
	 * @param arma the arma to set
	 */
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the salud
	 */
	public double getSalud() {
		return salud;
	}

	/**
	 * @param salud the salud to set
	 */
	public void setSalud(double salud) {
		this.salud = salud;
	}

	/**
	 * @return the clase
	 */
	public Clase getClase() {
		return clase;
	}

	/**
	 * @param clase the clase to set
	 */
	public void setClase(Clase clase) {
		this.clase = clase;
	}

	// METODOS

	public void equiparArma(Arma unArma) {
		String armaEquipar = null;
		double danioArmaEquipar;
		int disparosArmaEquipar;
		boolean repetir = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige el nº de disparos");
		disparosArmaEquipar = Integer.parseInt(sc.nextLine());
		if (disparosArmaEquipar > 0) {
			System.out.println("Si tiene mas de 1 disparo el arma será un arco con 50 de daño");
			unArma.setDisparos(disparosArmaEquipar);
			unArma.setNombre("Arco");
			unArma.setPuntos(50);
			repetir = false;
		} else {
			while (repetir == true) {
				System.out.println("Elige el tipo de arma");
				armaEquipar = sc.nextLine();
				if (armaEquipar.matches("(.*)arco(.*)")) {
					System.out.println(
							"No puede ser un arco porque el nº de disparos debe ser mayor de 0. Elije otra arma");
					repetir = true;
				} else
					repetir = false;
			}

			unArma.setNombre(armaEquipar);
			System.out.println("Elije cuantos puntos de daño tiene el arma");
			danioArmaEquipar = Double.parseDouble(sc.nextLine());
			unArma.setPuntos(danioArmaEquipar);

		}

		this.arma = unArma;

	}

	public void golpear(Enemigo unEnemigo) {

		if (this.arma.getDisparos() > 0)
			this.arma.setDisparos(this.arma.getDisparos() - 1);
		else
			this.arma.setPuntos(20);
		unEnemigo.quitarVida(this.arma.getPuntos());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador [nick=");
		builder.append(nick);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", clase=");
		builder.append(clase);
		builder.append("]");
		return builder.toString();
	}

}
