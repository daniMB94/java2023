package T7E8;

import java.util.Objects;
import java.util.TreeSet;

public class CentroEducativo {

	private TreeSet<Expediente> expedientes;
	private String nombreCentro;
	private String direccion;
	private String localidad;
	private String telefono;
	private String email;
	
	public CentroEducativo(String nombreCentro, String direccion, String localidad, String telefono, String email) {
		super();
		this.nombreCentro = nombreCentro;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
		this.email = email;
		this.expedientes = new TreeSet<>();
	}

	public TreeSet<Expediente> getExpedientes() {
		return expedientes;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CentroEducativo [expedientes=");
		builder.append(expedientes);
		builder.append(", nombreCentro=");
		builder.append(nombreCentro);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreCentro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CentroEducativo other = (CentroEducativo) obj;
		return Objects.equals(nombreCentro, other.nombreCentro);
	}
	
	public void addExpediente(Expediente e) {
		this.expedientes.add(e);
	}
	
	public Expediente buscarExpediente(String dni) {
		for(Expediente e: this.expedientes) {
			if(e.getEstudiante().getDni().equals(dni))
				return e;
		}
		return null;
	}
	
}
