import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

class VisorRelojTest {

	@Test
	void relojIniciadoEnMediaNocheDaLaHoraCorrecta()throws HoraNoValidaException {
		VisorReloj reloj = VisorReloj.iniciarEnMediaNoche();
		String hora = reloj.leerHora();
		assertEquals("00 : 00", hora);
	}

	@Test
	void relojAvanzaCorrectamente() throws HoraNoValidaException{
		VisorReloj reloj = VisorReloj.iniciarEnMediaNoche();
        reloj.avanzarTiempo();
        String hora = reloj.leerHora();
        assertEquals("00 : 01", hora);
	}


	@Test
	void podemosConfigurarElRelojEnUnaHoraConcreta() throws HoraNoValidaException{
		VisorReloj reloj = VisorReloj.iniciarEnMediaNoche();
        reloj.configurar(13, 30);
        String hora = reloj.leerHora();
        assertEquals("13 : 30", hora);
	}

	@Test
	void relojReiniciaAlTerminarElDia() throws HoraNoValidaException{
		VisorReloj reloj = VisorReloj.iniciarEnMediaNoche();
        for(int i = 0; i< 1440; i++){
            reloj.avanzarTiempo();
        }
        String hora = reloj.leerHora();
        assertEquals("00 : 00", hora);
	}

}
