package com.sonata.aug24;

import com.sonata.aug24.Calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

 

public class calTest {
	Calculator c1 = new Calculator();
	@Test
	public void addTest() {
		assertEquals(60,c1.add(30, 30));
	}
		@Test
		public void divTest() {
			assertThrows(ArithmeticException.class,()->c1.div(4,0),"its error");
			
				
}
}

