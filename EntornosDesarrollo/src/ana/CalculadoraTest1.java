package ana;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CalculadoraTest1 {
	@Test
	final void testSuma() {
		int resultado = Calculadora.suma(6, 10);
		int esperado = 16;
		assertEquals(resultado, esperado);
	}
	@Test
	final void testResta() {
		int resultado = Calculadora.resta(20, 15);
		int esperado = 5;
		assertEquals(resultado, esperado);
	}
	@Test
	final void testProducto() {
		int resultado = Calculadora.producto(30, 2);
		int esperado = 60;
		assertEquals(resultado, esperado);
	}
	@Test
	final void testDivision() {
		float resultado = Calculadora.division(33, 11);
		float esperado = 3;
		assertEquals(resultado, esperado);
	}

}