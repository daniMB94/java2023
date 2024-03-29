package T7E8;

import java.time.LocalDate;

import T7E8.NotasCurso.Etapa;
import T7E8.NotasCurso.NombreCiclo;

public class TestExpedientesAlumnos {

	public static void main(String[] args) {
		


		Estudiante e1 = new Estudiante("28471029t", "Julio", "Filipino Rosales", LocalDate.of(1999, 6, 23), "Calle correría, Huercal-Overa", "jfilirosa@gmail.com", "667668293");
		Estudiante e2 = new Estudiante("20473826r", "Marisa", "Egea Laureana", LocalDate.of(2004, 1, 23), "Calle Paloma, Albox", "LaureanaMarisa@gmail.com", "672938201");
		
		/*int curso, int anio, Etapa etapa, NombreCiclo nombre*/
		NotasCurso nc1 = new NotasCurso(1, 2022, Etapa.FPSUPERIOR, NombreCiclo.DAW);
		NotasCurso nc11 = new NotasCurso(2, 2023, Etapa.FPSUPERIOR, NombreCiclo.DAW);
		NotasCurso nc2 = new NotasCurso(1, 2022, Etapa.FPSUPERIOR, NombreCiclo.DAW);
		NotasCurso nc21 = new NotasCurso(2, 2023, Etapa.FPSUPERIOR, NombreCiclo.DAW);
		
		nc1.addNota("Lenguaje de marcas", 3.00);
		nc1.addNota("Sistemas informáticos", 5.00);
		nc1.addNota("FOL", 9.00);
		nc1.addNota("BBDD", 7.00);
		nc1.addNota("Programación", 6.00);
		nc1.addNota("Entornos de desarrollo", 5.00);
		
		nc11.addNota("Entorno cliente", 6.00);
		nc11.addNota("Entorno servidor", 5.00);
		nc11.addNota("Despliegue Web", 6.00);
		nc11.addNota("Diseño", 8.00);
		nc11.addNota("Empresa", 7.00);
		
		nc2.addNota("Lenguaje de marcas", 6.00);
		nc2.addNota("Sistemas informáticos", 2.00);
		nc2.addNota("FOL", 6.00);
		nc2.addNota("BBDD", 7.00);
		nc2.addNota("Programación", 8.00);
		nc2.addNota("Entornos de desarrollo", 8.00);
		
		nc21.addNota("Entorno cliente", 5.00);
		nc21.addNota("Entorno servidor", 8.00);
		nc21.addNota("Despliegue Web", 9.00);
		nc21.addNota("Diseño", 10.00);
		nc21.addNota("Empresa", 9.00);
		
		Expediente exp1 = new Expediente(true, e1);
		Expediente exp2 = new Expediente(true, e2);
		
		exp1.addNotas(nc1);
		exp1.addNotas(nc11);
		
		exp2.addNotas(nc2);
		exp2.addNotas(nc21);
		
		/*String nombreCentro, String direccion, String localidad, String telefono, String email*/
		CentroEducativo jaroso = new CentroEducativo("Jaroso", "Carretera Vera", "Cuevas de Almanzora", "950950950", "iesjaroso@gmail.com");
		
		jaroso.addExpediente(exp1);
		jaroso.addExpediente(exp2);
		
		System.out.println(jaroso.buscarExpediente(e1.getDni()).mostrarNotas(1, Etapa.FPSUPERIOR));
		
	}

}
