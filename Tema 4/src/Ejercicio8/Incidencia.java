package Ejercicio8;

public class Incidencia {

	private String codigo;
	private String estado;
	private String problema;
	private String solucion;

	public static int pendientes = 0;

	// CONSTRUCTOR CON PARAMETROS
	public Incidencia(String problema) {
		super();
		this.codigo = generarCodigo();
		this.estado = "Abierta";
		this.problema = problema;
		this.solucion = "Por determinar";
		Incidencia.pendientes++;
	}

	// METODOS
	private String generarCodigo() {

		StringBuilder sb = new StringBuilder();
		sb.append("inc");
		for (int i = 0; i < 5; i++) {
			sb.append((int) Math.random() * 10);
		}

		return sb.toString();
	}

	public void resuelve(String solucion) {

		if (this.estado != "Resuelta") {
			this.estado = "Resuelta";
			this.solucion = solucion;
			Incidencia.pendientes--;
		}

	}

	public static int getPendiete() {
		return Incidencia.pendientes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Incidencia [codigo=");
		builder.append(codigo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", problema=");
		builder.append(problema);
		builder.append(", solucion=");
		builder.append(solucion);
		builder.append("]");
		return builder.toString();
	}

}
