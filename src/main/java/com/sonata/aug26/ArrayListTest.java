package com.sonata.aug26;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.util.SystemPropertyUtils;

public class ArrayListTest {

	@Test
	public void testAdd() {
		ArrayListDemo arrobj1=new ArrayListDemo();
		arrobj1.add(1);
		arrobj1.add(2);
		arrobj1.add(3);
		arrobj1.add(4);
		arrobj1.add(5);
		arrobj1.add(6);
		
		int size=arrobj1.getSize();
		System.out.println(size);
		assertEquals(6,size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
