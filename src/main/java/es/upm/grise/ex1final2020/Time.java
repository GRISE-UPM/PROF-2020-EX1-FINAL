package es.upm.grise.ex1final2020;

import java.time.LocalDateTime;

// Se podria hacer de muchas formas que Time participase en pruebas de interacción.
// Fijate que es lo mismo que se persigue con diseño testable
// Mi solución es Eliminar la invocación estática de getCurrentTime(). Con mockito después no hace falta nada más

public class Time {

	public LocalDateTime getCurrentTime () {
		LocalDateTime time = LocalDateTime.now();
		return time;	
	}

}
