package test.main;

import test.mypac.Apple;
import test.mypac.Pair;

public class MainClass02 {
	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new Pair<>("one", 100);
		String k1=p1.getKey();
		Integer v1=p1.getValue();
		
		Pair<String, Apple> p2 = new Pair<>("two", new Apple());
		String k2=p2.getKey();
		Apple v2=p2.getValue();
	}
}
