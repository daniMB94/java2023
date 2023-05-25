package com.examenfinal.daniel.modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva implements Comparable<Reserva> {
	
	private static int idGeneral = 1;
	
	private int id;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;
	private int cantidadHabitaciones;
	private int numPersonasPorHabitacion;
	private String dni;
	private String nacionalidad;
	private Hotel hotel;
	
	
	/**Crea un objeto reserva
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param cantidadHabitaciones
	 * @param numPersonasPorHabitacion
	 * @param dni
	 * @param nacionalidad
	 * @param hotel
	 */
	public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, int cantidadHabitaciones,
			int numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {
		super();
		this.id = idGeneral++;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.numPersonasPorHabitacion = numPersonasPorHabitacion;
		this.dni = dni;
		this.nacionalidad = nacionalidad;
		this.hotel = hotel;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Nos devuelve el id del objeto con tipo Integer para poder usarlo en compareTo y equals
	 * @return
	 */
	public Integer getIdInteger() {
		return (Integer) id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the fechaEntrada
	 */
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}


	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}


	/**
	 * @return the fechaSalida
	 */
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}


	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	/**
	 * @return the cantidadHabitaciones
	 */
	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}


	/**
	 * @param cantidadHabitaciones the cantidadHabitaciones to set
	 */
	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}


	/**
	 * @return the numPersonasPorHabitacion
	 */
	public int getNumPersonasPorHabitacion() {
		return numPersonasPorHabitacion;
	}


	/**
	 * @param numPersonasPorHabitacion the numPersonasPorHabitacion to set
	 */
	public void setNumPersonasPorHabitacion(int numPersonasPorHabitacion) {
		this.numPersonasPorHabitacion = numPersonasPorHabitacion;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}


	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	/**
	 * @return the hotel
	 */
	public Hotel getHotel() {
		return hotel;
	}


	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva [id=");
		builder.append(id);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", fechaSalida=");
		builder.append(fechaSalida);
		builder.append(", cantidadHabitaciones=");
		builder.append(cantidadHabitaciones);
		builder.append(", numPersonasPorHabitacion=");
		builder.append(numPersonasPorHabitacion);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", nacionalidad=");
		builder.append(nacionalidad);
		builder.append(", hotel=");
		builder.append(hotel);
		builder.append("]\t");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return id == other.id;
	}

	
	@Override
	public int compareTo(Reserva o) {
		//Comparamos por fecha de entrada
		return this.fechaEntrada.compareTo(o.getFechaEntrada());
	}
	
	
	

}
