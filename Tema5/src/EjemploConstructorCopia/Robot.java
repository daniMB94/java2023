package EjemploConstructorCopia;

public class Robot {

	private String color;
	private int salud;
	private int coordX;
	private int coordY;


	//Constructor por defecto
	public Robot() {
		this.color = "Negro";
		this.salud = 100;
		this.coordX = 0;
		this.coordY = 0;
	}
	
	//Constructor definido o con parámetros
	public Robot(String unColor, int unaSalud, int unaCoordX, int unaCoordY) {
		this.color = unColor;
		this.salud = unaSalud;
		this.coordX = unaCoordX;
		this.coordY	= unaCoordY;
	
	}
	
	//Constructor copia
	public Robot(Robot otroRobot) {
		this.color = otroRobot.color;
		this.salud = otroRobot.salud;
		this.coordX = otroRobot.coordX;
		this.coordY = otroRobot.coordY;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	/**
	 * @return the coordX
	 */
	public int getCoordX() {
		return coordX;
	}

	/**
	 * @param coordX the coordX to set
	 */
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	/**
	 * @return the coordY
	 */
	public int getCoordY() {
		return coordY;
	}

	/**
	 * @param coordY the coordY to set
	 */
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	
	public void setPosicion(int cX, int cY) {
		this.coordX = cX;
		this.coordY = cY;
	}
	
	public void setPosicionRandom() {
		this.coordX = (int)(Math.random() * 20);
		this.coordY = (int)(Math.random() * 20);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [color=");
		builder.append(color);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", coordX=");
		builder.append(coordX);
		builder.append(", coordY=");
		builder.append(coordY);
		builder.append("]");
		return builder.toString();
	}
	
	
}
