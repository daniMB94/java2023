package T7E8;

import java.util.HashMap;
import java.util.Objects;

public class NotasCurso {

	enum Etapa {
		ESO, BACHILLERATO, FPBASICA, FPMEDIO, FPSUPERIOR
	}
	enum NombreCiclo {
		DAW, ASIR, DAM
	}
	private int curso;
	private HashMap<String, Double> notas;
	private int anio;
	private Etapa etapa;
	private NombreCiclo nombre;
	public NotasCurso(int curso, int anio, Etapa etapa, NombreCiclo nombre) {
		super();
		this.curso = curso;
		this.anio = anio;
		this.etapa = etapa;
		this.nombre = nombre;
		this.notas = new HashMap<>();
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Etapa getEtapa() {
		return etapa;
	}
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	public NombreCiclo getNombre() {
		return nombre;
	}
	public void setNombre(NombreCiclo nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [curso=");
		builder.append(curso);
		builder.append(", notas=");
		builder.append(notas);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", etapa=");
		builder.append(etapa);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(anio, curso, etapa, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasCurso other = (NotasCurso) obj;
		return anio == other.anio && curso == other.curso && etapa == other.etapa && nombre == other.nombre;
	}
	
	public void addNota(String asignatura, Double nota) {
		this.notas.put(asignatura, nota);
	}
	public void deleteNota(String asignatura) {
		this.notas.remove(asignatura);
	}
	
	public Double buscar(String asignatura) {

		
		for(String asig: this.notas.keySet()) {
			if(asig.equals(asignatura))
				return this.notas.get(asig);
		}
			
		return null;
	}
	
	public String pintar() {
		StringBuilder sb = new StringBuilder();
		
		for(String asignatura: this.notas.keySet()) {
			sb.append(asignatura);
			if(asignatura.length()>16)
				sb.append("\t");
			else if(asignatura.length()>8)
				sb.append("\t\t");
			else
				sb.append("\t\t\t");
			sb.append(this.notas.get(asignatura) + "\n");
		}
		sb.append("---------------------------\n");
		return sb.toString();
	}

	
}
