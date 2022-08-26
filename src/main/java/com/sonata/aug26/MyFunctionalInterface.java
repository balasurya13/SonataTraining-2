package com.sonata.aug26;

@FunctionalInterface
public interface MyFunctionalInterface {
	void m1() ;
	default void m2() {System.out.println("m1");}
static void m3() {System.out.println("m2");}
}
