package P1_6;

public class TrianguloEscaleno extends Triangulo {

	public TrianguloEscaleno(double lado1, double lado2, double lado3) {
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
		double s = (this.lado1 + this.lado2 + this.lado3);
		area = Math.pow((s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3)), 1/2);
		return 0;
	}

	@Override
	public boolean valido() {
		if(this.lado1 != this.lado2 && this.lado3 != this.lado1 && this.lado2 != this.lado3)
			return true;
		else
			return false;
	}

}
