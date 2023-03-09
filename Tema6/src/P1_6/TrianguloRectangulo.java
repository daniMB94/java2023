package P1_6;

public class TrianguloRectangulo extends Triangulo {

	public TrianguloRectangulo(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}
	
	//METODOS
	
	
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
		double hipotenusa = 0;
		hipotenusa = Math.pow((Math.pow(this.lado2, 2) + (Math.pow(this.lado1, 2))), 1/2);
		if(this.lado3 == hipotenusa)
			return true;
		else
			return false;
	}

}
