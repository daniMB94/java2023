package EjercicioParaPracticar;

public class Empleado {
	
	/*
	 * PROPIEDADES
	 */
	private String nombre;
	private String apellidos;
	private int edad;
	private String email;
	private double salario;
	private double irpf;
	private double segSocial;
	private String departamento;
	
	/*
	 * CONSTRUCTOR POR DEFECTO
	 */

	
	public Empleado(String nombre, String apellidos, int edad, String email, double salario, double irpf,
			double segSocial, String departamento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.salario = salario;
		this.irpf = irpf;
		this.segSocial = segSocial;
		this.departamento = departamento;
	}
	
	
	/*
	 * CONSTRUCTOR CON PROPIEDADES
	 */

	public Empleado() {
		super();
		
		this.nombre = "Juan";
		this.apellidos = "Hernández Sequeira";
		this.edad = 38;
		this.email = "jsequeira@correo.com";
		this.salario = 1739;
		this.irpf = 0.19;
		this.segSocial = 0.05;
		this.departamento = "Informática";
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public double getSegSocial() {
		return segSocial;
	}

	public void setSegSocial(double segSocial) {
		this.segSocial = segSocial;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double salarioNeto() {
		double descuento;
		
		descuento = (this.salario * this.irpf) + (this.salario * this.segSocial); 
		
		return this.salario-descuento;
	}
	
	
	
}
