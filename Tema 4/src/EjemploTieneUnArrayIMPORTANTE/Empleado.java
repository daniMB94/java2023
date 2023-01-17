package EjemploTieneUnArrayIMPORTANTE;

public class Empleado {

	private String nombre;
	private String apellidos;
	private String email;
	private String puesto;
	private int salario;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param puesto
	 * @param salario
	 */
	public Empleado(String nombre, String apellidos, String email, String puesto, int salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.puesto = puesto;
		this.salario = salario;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", puesto=" + puesto
				+ ", salario=" + salario + "]";
	}
	
	
	
}
