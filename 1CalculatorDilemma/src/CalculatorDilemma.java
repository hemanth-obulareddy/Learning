import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to Calculate");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter + operator to Addition");
		System.out.println("Enter - operator to Subtration");
		System.out.println("Enter * operator to Multipication");
		System.out.println("Enter / operator to Division");
		char operator=sc.next().charAt(0);
		calculate(operator,num1,num2);
	}
	public static void calculate(char  operator , int num1 , int num2)
	{
		switch(operator)
		{
		case '+':
			System.out.println(num1+"+"+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+" = "+(num1*num2));
			break;
		case '/':
			System.out.println(num1+"/"+num2+" = "+(num1/num2));
			break;
		default: System.out.println("Enter valid operator");	
			
		}
	
	}
}
