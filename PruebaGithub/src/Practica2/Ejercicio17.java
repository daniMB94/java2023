package Practica2;

public class Ejercicio17 {

	public static void main(String[] args) {

		double a, b, c, d, e, f, g;
		
		
		a = Math.random()*50;
		if (a < 1) {
			a = Math.random()*50;
		}
		a = Math.floor(a);
		
		b = Math.floor((Math.random()*101));
		while (b%2 != 0) {
			b = (Math.random()*101);
			b = Math.floor(b);
		}
		
		c = Math.random()*11;
		if (c<1) {
			c = Math.random()*11;
		}
		c = Math.floor(c);
		
		d = Math.random()*-151;
		d = Math.floor(d);
		while (d<-150 || d>-50) {
			d = (Math.random()*-151);
			d = (Math.floor(d));
		}
		
		e = Math.random();
		
		if(e>0.5) {
			e = Math.random()*101;
		} else {
			e = Math.random()*-101;
		}
		e = Math.floor(e);
		
		f = Math.random();
		if(f >= 0.8) {
			f = 125;
		} else if (f >= 0.6) {
			f = 77;
		} else if (f >= 0.4) {
			f = 33;
		} else if (f >= 0.2) {
			f = 7;
		} else if (f >= 0) {
			f = 5;
		}
				 
			
		g = Math.random()*13;
		if (g<1) {
			g = Math.random()*13;
		}
		g = Math.floor(g);

		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
