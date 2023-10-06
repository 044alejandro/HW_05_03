package ConverterTemperature;

public class Kelvin extends ConverterTemperature{
	private int value;

	public Kelvin(int value) {
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
		return value - 273.15;
	}
}
