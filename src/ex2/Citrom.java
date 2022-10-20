package ex2;

import java.util.Random;

public class Citrom {
	double suly;
	double kerulet;
	public static String color;
	
	public Citrom(String szin) {
		suly = Math.random()*100;
		kerulet = Math.random();
		color = szin;
	}
	public Citrom() {}
}
