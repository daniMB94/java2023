package P2_2;

import java.util.ArrayList;

public class PrimeVideo {

	private ArrayList<Multimedia> catalogo;
	private ArrayList<Cliente> suscriptores;
	private double ganancias;

	public PrimeVideo() {
		super();
		this.catalogo = new ArrayList<>();
		this.suscriptores = new ArrayList<>();
		this.ganancias = 0;
	}

	/**
	 * @param ganancias the ganancias to set
	 */
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}

	public void addSuscriptor(Cliente c) {
		boolean aniadir = true;
		for (Cliente cSus : this.suscriptores) {
			if (cSus.equals(c))
				aniadir = false;
		}

		if (aniadir)
			this.suscriptores.add(c);
	}

	public void addMultimedia(Multimedia m) {
		boolean aniadir = true;
		for (Multimedia mult : this.catalogo) {
			if (mult.equals(m))
				aniadir = false;

		}
		if (aniadir)
			this.catalogo.add(m);
	}

	public void ver(Multimedia m, Cliente c) {
		
		if (!c.esPro()) {
			this.ganancias += m.getPrecio();
			

		} else if (!m.getPlus()) {
			this.ganancias += m.getPrecio();
			
		}
			

	}

	public double getGanancias() {
		int contadorPro = 0;
		int contadorNoPro = 0;
		for(Cliente c : this.suscriptores) {
			if(c.getPrecioMensual() == 3)
				contadorNoPro++;
			else
				contadorPro++;
		}
		
		this.ganancias = (this.ganancias * 12) + (contadorPro*5*12 + contadorNoPro*3*12);

		return this.ganancias;
	}

}
