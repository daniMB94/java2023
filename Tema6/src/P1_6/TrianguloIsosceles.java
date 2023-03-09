package P1_6;

public class TrianguloIsosceles extends Triangulo {
	
	
	public TrianguloIsosceles(double lado1, double lado2, double lado3) {
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
		area = (this.lado1 * this.lado2) / 2;
		return area;
	}

	@Override
	public boolean valido() {
		if(this.lado1 == this.lado2 && this.lado3 != this.lado1)
			return true;
		else
			return false;
	}

}
