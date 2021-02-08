package es.upm.grise.ex1final2020;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;


public class Test_Key {

	@Test
	public void test() {
		String time1;
		String time2;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss-SSS");
		LocalDateTime time = LocalDateTime.now();
		time1=Key.getKey(); //porque está definida como estática
		time2=formatter.format(time);
		
		System.out.println(time1);
		System.out.println(time2);
				
		time1=time1.substring(0,time1.length()-4);
		time2=time2.substring(0,time2.length()-4);
		System.out.println(time1);
		System.out.println(time2);
				
		assertEquals(time1,time2);
	}
}