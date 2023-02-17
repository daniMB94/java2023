package Prac_Here_2;

public class Aplicacion {

	public static void main(String[] args) {
		
		//CuentaBancaria cb1 = new CuentaBancaria(10000, true, false, 100);
		CuentaAhorro ca1 = new CuentaAhorro(5000, 50, 0.02);
		CuentaCorriente cc1 = new CuentaCorriente(7000, 80);
		CuentaJoven cj1 = new CuentaJoven(1000, 40);

		Banco mibbba = new Banco("Mi Banco");
		//mibbba.addCuenta(cb1);
		mibbba.addCuenta(ca1);
		mibbba.addCuenta(cc1);
		mibbba.addCuenta(cj1);

		System.out.println(mibbba);

		mibbba.mostrarPrestamosPreconcedidos();
		

	}

}