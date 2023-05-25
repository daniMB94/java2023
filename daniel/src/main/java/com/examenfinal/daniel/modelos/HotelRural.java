package com.examenfinal.daniel.modelos;

public class HotelRural extends Hotel {
	
	private boolean calefaccion = true;
	
	public HotelRural(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
			double precioNoche, int calificacion) {
		super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
		
	}

	

}
