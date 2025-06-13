package ExceptionHandling;

public class Thermostat {
	
	private static final int MIN_TEMP = 50;
	private static final int MAX_TEMP = 90;
	
	public void setTemperature(int temp) throws TemperatureTooHighException, TemperatureTooLowException {
		if(temp > MAX_TEMP) throw new TemperatureTooHighException("Temperature " + temp + " is too high (max " + MAX_TEMP + ")");
		else if(temp < MIN_TEMP) throw new TemperatureTooLowException("Temperature " + temp + " is too low (min " + MIN_TEMP + ")");
		else System.out.println("Temperature set to " + temp);
	}

	public static void main(String[] args) {
		
		Thermostat thermostat = new Thermostat();
		
		try {
			thermostat.setTemperature(95);
		} catch(TemperatureTooHighException | TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			thermostat.setTemperature(45);
		} catch(TemperatureTooHighException | TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			thermostat.setTemperature(75);
		} catch(TemperatureTooHighException | TemperatureTooLowException e) {
			System.out.println(e.getMessage());
		}

	}

}
