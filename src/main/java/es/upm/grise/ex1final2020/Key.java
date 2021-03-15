package es.upm.grise.ex1final2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Tenemos que incluir la clase Time por inyección de dependencia.
//
// La solución no me gusta demasiado porque los elementos estáticos son siempre problemáticos. Pero funciona.

public class Key {

	static Time time;

	public static String getKey() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS");
		LocalDateTime curremtTime = time.getCurrentTime();
		return formatter.format(curremtTime);
	}	
	
}
