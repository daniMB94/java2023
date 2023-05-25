package com.examenfinal.daniel.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.examenfinal.daniel.modelos.Hotel;
import com.examenfinal.daniel.modelos.Reserva;


public class Buking {

	private static List<Hotel> hoteles;
	private static Set<Reserva> reservas;

	/**
	 * Crea obetos Buking inicializando el List de Hoteles y el Set de reservas
	 */
	public Buking() {
		super();
		hoteles = new ArrayList<>();
		reservas = new HashSet<>();
	}

	
	/**
	 * @return the hoteles
	 */
	public static List<Hotel> getHoteles() {
		return hoteles;
	}


	/**
	 * @param hoteles the hoteles to set
	 */
	public static void setHoteles(List<Hotel> hoteles) {
		Buking.hoteles = hoteles;
	}


	/**
	 * @return the reservas
	 */
	public static Set<Reserva> getReservas() {
		return reservas;
	}


	/**
	 * @param reservas the reservas to set
	 */
	public static void setReservas(Set<Reserva> reservas) {
		Buking.reservas = reservas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Buking [getHoteles()=");
		builder.append(getHoteles());
		builder.append(", getReservas()=");
		builder.append(getReservas());
		builder.append("]");
		return builder.toString();
	}


	/**
	 * Aniade un hotel a al List de hoteles
	 * 
	 * @param h
	 */
	public static void addHotel(Hotel h) {
		int posicion = hoteles.indexOf(h);

		if (posicion < 0)
			hoteles.add(h);
	}

	/**
	 * Elimina un hotel del List de hoteles
	 * 
	 * @param id
	 */
	public static void deleteHotel(int id) {
		// Para eliminar se determina la posicion del hotel que tiene ese id y luego se
		// usa dicha posicion para pasarlo como parametro al método .remove
		int posicion;

		for (Hotel hotel : hoteles) {
			if (hotel.getIdInteger().equals((Integer) id)) {
				posicion = hoteles.indexOf(hotel);
				hoteles.remove(posicion);
			}

		}

	}

	/**
	 * Aniade una reserva al Set de reservas
	 * 
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param cantidadHabitaciones
	 * @param numPersonasPorHabitacion
	 * @param dni
	 * @param nacionalidad
	 * @param hotel
	 */
	public static void addReserva(LocalDate fechaEntrada, LocalDate fechaSalida, int cantidadHabitaciones,
			int numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel) {

		reservas.add(new Reserva(fechaEntrada, fechaSalida, cantidadHabitaciones, numPersonasPorHabitacion, dni,
				nacionalidad, hotel));

	}
	
	public static Reserva findReservaId(int id) {
		return reservas.stream().filter(r -> r.getIdInteger().equals((Integer) id)).findFirst().orElse(null);
	}

	/**
	 * Elimina una reserva pasándole un id
	 * 
	 * @param id
	 */
	public static void deleteReseva(int id) {
		
		reservas.remove(findReservaId(id));

	}

	/**
	 * Busca un hotel por su id
	 * @param id
	 * @return
	 */
	public static Hotel findHotelById(int id) {
		
		return hoteles.stream().filter(h -> h.getIdInteger().equals((Integer) id)).findFirst().orElse(null);

	}
	/**
	 * Busca un hotel por su nombre
	 * @param nombre
	 * @return
	 */
	public static Hotel findHotelByNombre(String nombre) {
		return hoteles.stream().filter(h -> h.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
	/**
	 * Devuelve un List de hoteles pasándole una provincia como parámetro
	 * @param provincia
	 * @return
	 */
	public List<Hotel> findHotelByProvincia(String provincia){
		return hoteles.stream()
				.filter(hotel -> hotel.getProvincia().equals(provincia))
				.collect(Collectors.toList());
	}
	
	
	/**
	 * Devuelve un List con los hoteles de menos de 20 habitaciones ordenados por precio
	 * @return
	 */
	public List<Hotel> getHotelePequenios(){
		return hoteles.stream()
				.filter(hotel -> hotel.getNumHabitaciones() < 20)
				.sorted(Comparator.comparing(Hotel::getPrecioNoche))
				.collect(Collectors.toList());
	}
	
	/**
	 * Pinta los hoteles del List de la clase Buking
	 */
	public static void listarHoteles() {
		hoteles.stream().forEach(System.out::println);
	}

	/**
	 * Pinta todas las reservas de la clase buking
	 */
	public static void listarReservas() {
		reservas.stream().forEach(System.out::println);
	}
	
	/**
	 * Pinta las reservas por país
	 */
	public static void reservasPorPais() {
		reservas.stream()
				.collect(Collectors.groupingBy(Reserva::getNacionalidad))
				.forEach((k, v) -> {
					System.out.println("País: " + k);
					for (Reserva reserva : v) {
						System.out.println("\t\t");
						System.out.println(v);
					}
				});

	}
	
	/**
	 * Pinta las reservas activas de un hotel en concreto
	 * @param nombre
	 */
	public static void reservasActivasPorHotel(String nombre) {
		Hotel hotelBuscado = Buking.findHotelByNombre(nombre);
		
		reservas.stream().filter(r -> r.getIdInteger().equals(hotelBuscado.getIdInteger())).forEach(System.out::println);
		
	}

}
