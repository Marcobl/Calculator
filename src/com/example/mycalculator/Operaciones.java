package com.example.mycalculator;

public class Operaciones {
	
	public static int calcular_suma(String a, String b){
		a.trim();
		b.trim();
		if (a.equals("")||b.equals("")) {
			a="0";
			b="0";
		}
				
		return  (Integer.parseInt(a) + Integer.parseInt(b));		
		
	}
	
	public static int calcular_resta(String a, String b){
		a.trim();
		b.trim();
		if (a.equals("")||b.equals("")) {
			a="0";
			b="0";
		}
		
		return  (Integer.parseInt(a) - Integer.parseInt(b));
	}
	
	public static int calcular_multiplicacion(String a, String b){
		a.trim();
		b.trim();
		if (a.equals("")||b.equals("")) {
			a="0";
			b="0";
		}
		
		return  (Integer.parseInt(a) * Integer.parseInt(b));
		
	}
	
	public static Double calcular_division(String a, String b){
		
		a.trim();
		b.trim();
		if (a.equals("")||b.equals("")) {
			a="0";
			b="0";
		}
		
		return (double) (Integer.parseInt(a) + Integer.parseInt(b));
	}

}
