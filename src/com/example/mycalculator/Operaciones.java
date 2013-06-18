package com.example.mycalculator;

public class Operaciones {

	public static String calcular_operacion(String a, String b, String signo) {
		a.trim();
		b.trim();
		/*
		 * if (a.equals("")||b.equals("")) { a="0"; b="0"; }
		 */

		if (signo.equals("+")) {

			return String.valueOf((Integer.parseInt(a) + Integer.parseInt(b)));

		} else if (signo.equals("-")) {

			return String.valueOf((Integer.parseInt(a) - Integer.parseInt(b)));

		} else if (signo.equals("*")) {

			return String.valueOf((Integer.parseInt(a) * Integer.parseInt(b)));

		} else {

			return String.valueOf((Double.parseDouble(a) / Double
					.parseDouble(b)));

		}

	}

}
