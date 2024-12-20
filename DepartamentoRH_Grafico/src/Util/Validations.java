package Util;

public class Validations {
	public static boolean isNumberValid(String valorDigitado)
	{
		return valorDigitado.matches("\\d+");
	}
	
	public static boolean isNumeroDecimalValido(String valorDigitado)
	{
		return valorDigitado.matches("\\d+(\\.\\d+)?");
	}
}
