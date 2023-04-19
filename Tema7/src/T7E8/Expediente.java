 package T7E8;

import java.util.HashSet;
import java.util.Objects;

public class Expediente {

	private HashSet<NotasCurso> notas;
	private boolean activo;
	private Estudiante estudiante;
	
	public Expediente(boolean activo, Estudiante estudiante) {
		super();
		this.activo = activo;
		this.estudiante = estudiante;
		this.notas = new HashSet<>();
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [notas=");
		builder.append(notas);
		builder.append(", activo=");
		builder.append(activo);
		builder.append(", estudiante=");
		builder.append(estudiante);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(estudiante);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return Objects.equals(estudiante, other.estudiante);
	}
	
	public void addNotas(NotasCurso nc) {
		this.notas.add(nc);
	}
	
	public String mostrarNotas(int curso, String etapa) {
		StringBuilder sb = new StringBuilder();
		for(NotasCurso nc: this.notas) {
			if(nc.getEtapa().equals(etapa) && nc.getCurso() == curso)
				sb.append(nc.pintar());
				sb.append("\n");
		}
		return sb.toString();
	}
	
}
