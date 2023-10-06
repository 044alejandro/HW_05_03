package ConverterTemperature;

public class Fahrenheit extends ConverterTemperature{
	private int value;

	public Fahrenheit(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public double convert() {
		return (value - 32) * 5 / 9;
	}
}
