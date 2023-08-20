import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.println( "temperature from Fahrenheit to Celsius is: "+temperatureConverter.convertFahrenheitToCelsius(fahrenheit));

	}

}
