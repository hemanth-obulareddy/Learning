import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:\n 1. Convert Celsius to Fahrenheit\n 2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		int i=sc.nextInt();
		
		if(i==1) {
			System.out.println("Enter the temperature in Celsius:");
			double celsius=sc.nextDouble();
			System.out.println(celsius+"C is equivalent to "+celsiusToFahrenheit(celsius)+"F");
		}
		else if(i==2) {
			System.out.println("Enter the temperature in Fahrenheit");
			double fahrenheit=sc.nextDouble();
			System.out.println(fahrenheit+"F is equivalent to "+fahrenheitToCelsius(fahrenheit)+"C");
		}
		else {
			System.out.println("Enter valid option");
		}
		
	}
	public static double celsiusToFahrenheit(double celsius)
	{
		return (celsius * 9/5) + 3;
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit-32)*5/9;
	}
}
