package ConverterTemperature;

public class Main {
	public static void main(String[] args) {

		Kelvin kelvinValue = new Kelvin(5);
		double kelvinToCelsius = kelvinValue.convert();
		System.out.println("Kelvin " + kelvinValue.getValue() + " To Celsius: " + kelvinToCelsius);

		kelvinValue.setValue(50);
		kelvinToCelsius = kelvinValue.convert();
		System.out.println("Kelvin " + kelvinValue.getValue() + " To Celsius: " + kelvinToCelsius);

		Fahrenheit fahrenheitValue = new Fahrenheit(5);
		double fahrenheitToCelsius = fahrenheitValue.convert();
		System.out.println("Fahrenheit " + fahrenheitValue.getValue() + " To Celsius: " + fahrenheitToCelsius);
	}
}