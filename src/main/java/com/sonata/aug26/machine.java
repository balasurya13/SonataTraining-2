package com.sonata.aug26;

public interface machine {

	String speedup();
	String slowdown();
	default String turnAlarmon() {
		return "turn on alarm" ;
	}
	default String turnalarmoff() {
		return "turn off alarm ";	
		}
 public static String colour() {
	 return "the fridge colour is your choice";
 }
}
