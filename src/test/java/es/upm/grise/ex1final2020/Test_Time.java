package es.upm.grise.ex1final2020;

import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

// El test es correcto. Sólo tenías que usar una versión más alta de jUnit (he puesto la 4.11).

public class Test_Time {

	@Test
	public void test() {
		Time time = new Time();
		
		LocalDateTime time1 = LocalDateTime.now();
		LocalDateTime time2 =time.getCurrentTime();
		long ms = ChronoUnit.MILLIS.between(time1,time2);

		assertTrue(ms<5);

	}

}
