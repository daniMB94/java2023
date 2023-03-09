package P1_6;

public class TrianguloEquilatero extends Triangulo {

	public TrianguloEquilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}
	
	@Override
	public int compareTo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		double area = 0;
		area = (Math.pow(3,2) * Math.pow(this.lado1, 2)) / 4;
		return area;
	}

	@Override
	public boolean valido() {
		if(this.lado1 == this.lado2 && this.lado3 == this.lado1)
			return true;
		else
			return false;
	}

}
