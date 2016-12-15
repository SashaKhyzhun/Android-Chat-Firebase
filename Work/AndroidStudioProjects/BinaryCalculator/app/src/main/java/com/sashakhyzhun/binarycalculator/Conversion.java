package com.sashakhyzhun.binarycalculator;

import android.app.Activity;

public class Conversion extends Activity {

	/**
	 * DECIMAL TO BINARY
	 */
	
	public String converterDecimalParaBinary(long valor) {
		long offset = -1;
		StringBuilder sb = new StringBuilder();

		if (valor == 0) {
			return "0";
		}

		while (valor > 0) {
			offset = (long) (valor % 2);
			valor = valor / 2;
			sb.insert(0, offset);
		}

		return sb.toString();
	}

	/**
	 * DECIMAL TO OCTAL
	 */
	
	public String converterDecimalParaOctal(long valor) {
		long offset = -1;
		StringBuilder sb = new StringBuilder();

		if (valor == 0) {
			return "0";
		}

		while (valor > 0) {
			offset = (long) (valor % 8);
			valor = valor / 8;
			sb.insert(0, offset);
		}
		
		return sb.toString();
	}

	/**
	 * DECIMAL TO HEXADECIMAL
	 */
	
	public String converterDecimalParaHexadecimal(long valor) {
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		long offset = -1;
		StringBuilder sb = new StringBuilder();

		if (valor == 0) {
			return "0";
		}

		while (valor > 0) {
			offset = (long) (valor % 16);
			valor = valor / 16;
			sb.insert(0, hex[(int) offset]);
		}

		return sb.toString();
	}

	/**
	 * BINARY TO DECIMAL
	 */
	
	public long converterBinaryParaDecimal(String valorBinary) {
		long valor = 0;

		for (int i = valorBinary.length(); i > 0; i--) {
			valor += Integer.parseInt(valorBinary.charAt(i - 1) + "") * Math.pow(2, (valorBinary.length() - i));
		}

		return valor;
	}

	/**
	 * BINARY TO OCTAL
	 */
	
	public String converterBinaryParaOctal(String binary) {
		StringBuilder sb = new StringBuilder();
		int positionInit = 0;
		int positionFinal = 0;

		positionInit = binary.length();
		positionFinal = positionInit;

		while (positionInit > 0) {
			positionInit = ((positionInit - 3) >= 0) ? positionInit - 3 : 0;

			sb.insert(0, converterBinaryParaDecimal(binary.substring(positionInit, positionFinal)));

			positionFinal = positionInit;
		}

		return sb.toString();
	}

	/**
	 * BINARY TO HEXADECIMAL
	 */
	
	public String converterBinaryParaHexadecimal(String binary) {
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		StringBuilder sb = new StringBuilder();
		int positionInit = 0;
		int positionFinal = 0;
		char characterFound = '-';

		positionInit = binary.length();
		positionFinal = positionInit;

		while (positionInit > 0) {
			positionInit = ((positionInit - 4) >= 0) ? positionInit - 4 : 0;

			characterFound = hex[(int) converterBinaryParaDecimal(binary.substring(positionInit, positionFinal))];
			sb.insert(0, characterFound);

			positionFinal = positionInit;
		}

		return sb.toString();
	}

	/**
	 * OCTAL TO BINARY
	 */
	
	public String converterOctalParaBinary(String valorOctal) {
		long decimal = Long.parseLong(valorOctal, 8);
		return Long.toBinaryString(decimal);
	}

	/**
	 * OCTAL TO DECIMAL
	 */
	
	public long converterOctalParaDecimal(String valorOctal) {
		long valor = 0;

		for (int i = valorOctal.length(); i > 0; i--) {
			valor += Integer.parseInt(valorOctal.charAt(i - 1) + "")
					* Math.pow(8, (valorOctal.length() - i));
		}

		return valor;
	}

	/**
	 * OCTAL TO HEXADECIMAL
	 */
	
	public String converterOctalParaHexadecimal(String valorOctal) {
		long valorDecimal = converterOctalParaDecimal(valorOctal);
		return converterDecimalParaHexadecimal(valorDecimal);
	}

	/**
	 * HEXADECIMAL TO BINARY
	 */
	
	public String converterHexadecimalParaBinario(String valorHexa) {
		long decimal = Long.parseLong(valorHexa, 16);
		return Long.toBinaryString(decimal);
	}

	/**
	 * HEXADECIMAL TO DECIMAL
	 */
	
	public long converterHexadecimalParaDecimal(String valorHexa) {
		return Long.parseLong(valorHexa, 16);
	}

	/**
	 * HEXADECIMAL TO OCTAL
	 */
	
	public String converterHexadecimalParaOctal(String valorHexa) {
		long decimal = Long.parseLong(valorHexa, 16);
		return Long.toOctalString(decimal);
	}
}