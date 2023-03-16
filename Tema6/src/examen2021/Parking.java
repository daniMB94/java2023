package examen2021;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {

	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<PlazaAparcamiento> plazas;
	private int numPlazasDisponibles;
	private float saldoAcumulado;
	
	static final float PRECIO_BASE_POR_MINUTO = 0.04f;
	static final float PRECIO_BASE_POR_METRO = 0.2f;
	
	
	public Parking() {
		super();
		
		this.saldoAcumulado = 0;
		this.plazas = new ArrayList<>();
		
		//Crear 100 plazas y meterlas en el ArrayList
		for(int i=1; i<=100; i++) {
			plazas.add( new PlazaAparcamiento(i) );
		}
		
		this.vehiculos = new ArrayList<>();
		this.numPlazasDisponibles = 100;
		
	}


	/**
	 * @return the numPlazasDisponibles
	 */
	public int getNumPlazasDisponibles() {
		return numPlazasDisponibles;
	}


	/**
	 * @return the vehiculos
	 */
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}


	/**
	 * @return the saldoAcumulado
	 */
	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}
	
	
	public String imprimePlazas() {
		
		StringBuilder sb = new StringBuilder();
		
		for(PlazaAparcamiento p : this.plazas) {
			sb.append(p.getNumPlaza());
			sb.append(" - ");
			sb.append(p.estaLibre());
			sb.append("\n");
		}
		
		return sb.toString();		
	}
	
	
	public String registrarEntradaVehiculo(Vehiculo v) {
		
		//Comprobar si hay plazas libres
		if (this.numPlazasDisponibles > 0) {
			//Sacamos la plaza libre primera que haya en el parking
			PlazaAparcamiento plazaV = this.getPlazaLibre();
			
			//Ponemos la plaza ocupada
			plazaV.setEstaLibre(false);
			
			//Asignamos la plaza libre al vehículo
			v.setPlaza(plazaV);
			
			//Le ponemos al vehículo la fechahora de entrada
			v.setFechaEntrada(LocalDateTime.now().minusMinutes(10));
			
			//Añadimos el vehículo a la lista de vehículos del parking
			this.vehiculos.add(v);
			
			this.numPlazasDisponibles--;
			
			return new StringBuilder(v.getMatricula() + " - " + v.getPlaza().getNumPlaza()).toString();
			
			
		} else {
			return "El parking está lleno, no puedes entrar";
		}
	}
	
	
	public String registrarSalidaVehiculo(String matricula) {
		double precio = 0;
		Vehiculo v = null;
		boolean encontrado = false;
		
		//Buscamos el coche con esa matrícula
		for(Vehiculo veh: this.vehiculos) {
			if (veh.getMatricula().equals(matricula)) {
				v = veh;
				encontrado = true;
				break;
			} 
		}

		if (!encontrado) {
			return "No hay ningún coche con esa matrícula en el parking";
		} else {
			//Calcular ese vehículo cuánto le ha costado el tiempo que lleva en el parking
			precio = v.calcularImporte();
				
			//Sumar el importe al saldo acumulado del parking
			this.saldoAcumulado += precio;
				
			//Poner la plaza libre
			v.getPlaza().setEstaLibre(true);
			
			//Aumentamos el número de plazas disponibles
			this.numPlazasDisponibles++;
			
			//Eliminamos el vehículo de la lista del parking
			this.vehiculos.remove(v);
			
			
			StringBuilder sb = new StringBuilder();
			sb.append("Vehículo matrícula ");
			sb.append(v.getMatricula());
			sb.append(" entró ");
			sb.append(v.getFechaEntrada());
			sb.append(" y salió ");
			sb.append(LocalDateTime.now());
			sb.append(" estando ");
			sb.append(v.calcularMinutos());
			sb.append(" minutos, con un coste de ");
			sb.append(v.calcularImporte());
			
			
			return sb.toString();
		}
		
		
	}
	
	
	/**
	 * Devolver la primera plaza libre
	 */
	private PlazaAparcamiento getPlazaLibre() {
		
		for(PlazaAparcamiento p: this.plazas) {
			if (p.estaLibre())
				return p;
		}
		
		return null;
		
	}
	
	
	
}