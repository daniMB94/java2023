package Prueba;

	enum NombreMes {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
	enum Sexo {HOMBRE, MUJER, OTRO}
	
	
public class Enumerados {
	
	

	public static void main(String[] args) {


		NombreMes mes = NombreMes.ENERO; //Los valores de los enum son fijos
		Sexo sx = Sexo.HOMBRE;
		
		
		System.out.println("Mi primo nació en "+ mes);
		System.out.println("Mi primo tiene sexo " + sx);
	}

}
