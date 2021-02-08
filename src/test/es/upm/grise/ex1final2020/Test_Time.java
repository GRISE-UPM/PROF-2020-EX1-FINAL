package es.upm.grise.ex1final2020;

import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

public class Test_Time {

	@Test
	public void test() {
		LocalDateTime time1 = LocalDateTime.now();
		LocalDateTime time2 = Time.getCurrentTime();
		long ms = ChronoUnit.MILLIS.between(time1,time2);
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(ms);
		
		assertTrue(ms<5);

	}

}
