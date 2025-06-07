package Encapsulation;

public class Temperature {
	
	private double celsius;
	private double fahrenheit;
	private double kelvin;
	
	public Temperature(double value, char scale) {
		setTemperature(value, scale);
	}
	
	public void setTemperature(double value, char scale) {
		switch(Character.toUpperCase(scale)) {
		case 'C':
			this.celsius = value;
			this.fahrenheit = (value * 9/5) + 32;
			this.kelvin = value + 273.15;
			break;
		case 'F':
			this.fahrenheit = value;
			this.celsius = (value - 32) * 5/9;
			this.kelvin = celsius + 273.15;
			break;
		case 'K':
			this.kelvin = value;
			this.celsius = value - 273.15;
			this.fahrenheit = (celsius * 9/5) + 32;
			break;
		default:
			System.out.println("Invalid scale. Use C, F, or K.");
		}
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public double getFahrenheit() {
		return fahrenheit;
	}
	public double getKelvin() {
		return kelvin;
	}
	
	public String toString() {
		return String.format("Celsius: %.2fC\nFahrenheit: %.2fF\nKelvin: %.2fK", celsius, fahrenheit, kelvin);
	}
}
