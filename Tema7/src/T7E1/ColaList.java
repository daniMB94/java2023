package T7E1;

import java.util.ArrayList;

public class ColaList<E> {
	
	private ArrayList<E> procesos;
	
	public ColaList() {
		super();
		this.procesos = new ArrayList<>();
		
	}
	
	public boolean meter(E e) {
		return this.procesos.add(e);
	}
	
	public E poll() {
		if(this.procesos.size() == 0)
			return null;
		else {
			E primerElemento = this.procesos.get(0);
			this.procesos.remove(0);
			return primerElemento;
		}
			
	}
	
	public E peek() {
		if(this.procesos.size() == 0)
			return null;
		else
			return this.procesos.get(0);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ColaList [procesos=");
		builder.append(procesos);
		builder.append("]");
		return builder.toString();
	}
	
}
