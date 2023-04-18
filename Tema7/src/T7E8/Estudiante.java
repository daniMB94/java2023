package T7E8;

import java.time.LocalDate;
import java.util.Objects;

public class Estudiante {
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate f_nacimiento;
	private String direccion;
	private String email;
	private String telefono;
	public Estudiante(String dni, String nombre, String apellidos, LocalDate f_nacimiento, String direccion,
			String email, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.f_nacimiento = f_nacimiento;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getF_nacimiento() {
		return f_nacimiento;
	}
	public void setF_nacimiento(LocalDate f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
