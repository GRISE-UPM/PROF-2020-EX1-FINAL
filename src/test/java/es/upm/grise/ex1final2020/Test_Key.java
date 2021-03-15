package es.upm.grise.ex1final2020;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.Test;
import org.mockito.Mockito;

// Necesitamos incluir a Mockito en el pom.xml

public class Test_Key {

	@Test
	public void test() { 
		
		Time time = Mockito.mock(Time.class);
		// Tenemos que construir una fecha, no tomar la actual. Así está todo bajo control.
		LocalDateTime myTime = LocalDateTime.of(2015, Month.JULY, 29, 19, 30, 40);
		Mockito.when(time.getCurrentTime()).thenReturn(myTime);
		
		// Injectamos la clase Time. Queda feo al ser estático.
		Key.time = time;
		// Recuperamos el ID
		String id = Key.getKey();
		
		// No nos hace falta el formatter porque sabemos la fecha que debe devolver
		assertEquals("2015-07-29-19-30-40-000", id);
	}
}