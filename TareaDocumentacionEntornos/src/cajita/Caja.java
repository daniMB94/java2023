
package cajita;
/**
 * <h2>Clase que representa la caja registradora de un negocio</h2>
 *  <h4>Cuenta con los siguientes parámetros</h4>
 *  <ul>
 *  	<li> Numero de cajas registradoras del negocio</li>
 *  	<li> Capacidad maxima de la caja</li>
 *  	<li> Cantidad actual existente en la caja</li>
 *  </ul>
 *  
 *  
 * 
 * @author usuario1DAW
 * @version 15.03.2023
 *
 */
public class Caja {
	private static int numCajas;
	private int capacidadMaxima;
	private int cantidadActual;
	
/**
 * 
 * <h4>Constructor</h4>
 * <strong>>No</strong> tiene parametros
 * Inicializa la propiedad capacidadMaxima a 500 y cantidadAcutal a 0
 * 
 * @author usuario1DAW
 *
 */
public Caja(){
this(500, 0);
}

/**
 * <h4>Constructor sobrecargado</h4>
 * 
 * @param capacidadMax
 */
public Caja(int capacidadMax){
	this(capacidadMax,capacidadMax);
}

/**
 * <h4>Constructor sobrecargado</h4>
 * 
 * 
 * @param capacidadMax
 * @param cantidadActual
 */
public Caja(int capacidadMax, int cantidadActual){
	this.capacidadMaxima = capacidadMax;
	this.cantidadActual = cantidadActual;
	if(cantidadActual > capacidadMax){
		this.cantidadActual = capacidadMax;
	}
	numCajas++;
}

/**
 * <h4>Getter</h4>
 * @return capacidadMaxima
 */
public int getCapacidadMaxima() {
	return capacidadMaxima;
}

/**
 * <h4>Getter</h4>
 * @return cantidadActual
 */
public int getCantidadActual() {
	return cantidadActual;
}

/**
 * <h4>Metodo para llenar la caja</h4>
 * Introduce a la propiedad cantidadActual el {@value} de capacidadMaxima
 * 
 */
public void llenarCaja(){
	this.cantidadActual = this.capacidadMaxima;
}

/**
 * <h4>Metodo para sacar monedas</h4>
 * Si el valor del atributo cantidadMonedas es superior al valor del atributo cantidadActual se llama al metodo vaciar caja
 * 
 * @param cantidadMonedas
 */
public void sacarMonedas(int cantidadMonedas){
	if(cantidadMonedas > this.cantidadActual){
		vaciarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual - cantidadMonedas;
	}
	
	
	
}

/**
 * <h4>Método vaciar caja</h4>
 * Inicializa el atributo cantidadActual a cero
 */
public void vaciarCaja(){
	this.cantidadActual = 0;
}

/**
 * <h4>Metodo para agregarMonedas</h4>
 * Primero se comprueba si a la caja se caben más monedas comparando cantidadActual + cantidad a introducir contra capacidadMaxima.
 * En caso afirmativo se podrá introducir dinero llamando al método llenarCaja();
 * 
 * @param cantidad
 */
public void agregarMonedas(int cantidad){
	if (this.cantidadActual + cantidad > this.capacidadMaxima){
		llenarCaja();
	}
	else{
		this.cantidadActual = this.cantidadActual + cantidad;
	}
}

/**
 * <h4>Método para saber el número de cajas que hay</h4>
 * 
 * @return numCajas
 */
public static int getNumeroCajas() {
	return numCajas;
}
}
