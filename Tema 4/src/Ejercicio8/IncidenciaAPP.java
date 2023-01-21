package Ejercicio8;

import java.util.Scanner;

public class IncidenciaAPP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String solucion;

		Incidencia inc1 = new Incidencia("Roto el ascenso");
		Incidencia inc2 = new Incidencia("Fuga de agua en el quinto b");

		System.out.println(inc1);
		System.out.println(inc2);

		System.out.println("Actualmente hay " + Incidencia.getPendiete() + " incidencias pendientes");

		inc1.setEstado("En proceso");


		System.out.println("Escribe la solución para la incidencia con código " + inc1.getCodigo());
		solucion = sc.nextLine();
		inc1.resuelve(solucion);
		System.out.println(inc1);

		System.out.println("Ahora quedan " + Incidencia.getPendiete() + " incidencias por resolver");

		sc.close();
	}

}
