package T7E1;

public class Proceso {

	private String pid;
	private String nombre;
	private int RAM;
	private int prioridad;
	private double CPU;
	
	public Proceso(String pid, String nombre, double CPU, int RAM, int prioridad) {
		super();
		this.nombre = nombre;
		this.pid = pid;
		this.CPU = CPU;
		this.RAM = RAM;
		this.prioridad = prioridad;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public double getCPU() {
		return CPU;
	}

	public void setCPU(double cPU) {
		CPU = cPU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Proceso [pid=");
		builder.append(pid);
		builder.append(", CPU=");
		builder.append(CPU);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", RAM=");
		builder.append(RAM);
		builder.append(", prioridad=");
		builder.append(prioridad);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
