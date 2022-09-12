package com.sonata.Myservices.sep7;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MyServiceImplStubTest {
	
	@Test
	void test() {
		MyServiceStub my= new MyServiceStub();
		MyServiceImpl mys= new MyServiceImpl(my);
		List<String>filterMySer =mys.retriveRelated("Dummy");
	assertEquals(2,filterMySer.size());
	}
}
