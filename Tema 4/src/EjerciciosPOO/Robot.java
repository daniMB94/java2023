package EjerciciosPOO;

public class Robot {

	private int posicionX;
	private int posicionY;
	private boolean haLlegado;
	private int nPasos;

	private static int contadorRobots = 0;
	private static int FILASTABLERO;
	private static int COLUMNASTABLERO;

	/**
	 * @param posicionX
	 * @param posicionY
	 * @param haLlegado
	 * @param nPasos
	 */
	public Robot(int posicionX, int posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.nPasos = 0;
		this.haLlegado = false;
		Robot.contadorRobots++;
	}

	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}

	/**
	 * @param posicionX the posicionX to set
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	/**
	 * @return the posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}

	/**
	 * @param posicionY the posicionY to set
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	/**
	 * @return the haLlegado
	 */
	public boolean isHaLlegado() {
		return haLlegado;
	}

	/**
	 * @param haLlegado the haLlegado to set
	 */
	public void setHaLlegado(boolean haLlegado) {
		this.haLlegado = haLlegado;
	}

	/**
	 * @return the nPasos
	 */
	public int getnPasos() {
		return nPasos;
	}

	/**
	 * @param nPasos the nPasos to set
	 */
	public void setnPasos(int nPasos) {
		this.nPasos = nPasos;
	}

	/**
	 * @return the contadorRobots
	 */
	public static int getContadorRobots() {
		return contadorRobots;
	}

	/**
	 * @param contadorRobots the contadorRobots to set
	 */
	public static void setContadorRobots(int contadorRobots) {
		Robot.contadorRobots = contadorRobots;
	}

	/**
	 * @return the fILASTABLERO
	 */
	public static int getFILASTABLERO() {
		return FILASTABLERO;
	}

	/**
	 * @param fILASTABLERO the fILASTABLERO to set
	 */
	public static void setFILASTABLERO(int fILASTABLERO) {
		FILASTABLERO = fILASTABLERO;
	}

	/**
	 * @return the cOLUMNASTABLERO
	 */
	public static int getCOLUMNASTABLERO() {
		return COLUMNASTABLERO;
	}

	/**
	 * @param cOLUMNASTABLERO the cOLUMNASTABLERO to set
	 */
	public static void setCOLUMNASTABLERO(int cOLUMNASTABLERO) {
		COLUMNASTABLERO = cOLUMNASTABLERO;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [posicionX=");
		builder.append(posicionX);
		builder.append(", posicionY=");
		builder.append(posicionY);
		builder.append(", haLlegado=");
		builder.append(haLlegado);
		builder.append(", nPasos=");
		builder.append(nPasos);
		builder.append("]");
		return builder.toString();
	}

	public void irArriba(int minFilas) {
		this.posicionY -= 1;
		this.nPasos++;
		if (this.posicionY < minFilas)
			this.posicionY += 1;
	}

	public void irAbajo(int maxFilas) {
		this.posicionY += 1;
		this.nPasos++;
		if (this.posicionY > maxFilas)
			this.posicionY -= 1;

	}

	public void irDerecha(int maxColumnas) {

		this.posicionX += 1;
		this.nPasos++;
		if (this.posicionX > maxColumnas) {
			this.posicionX -= 1;
		}
	}

	public void irIzquierda(int minColumnas) {
		this.posicionX -= 1;
		this.nPasos++;
		if (this.posicionX < minColumnas) {
			this.posicionX += 1;
		}
	}

}
