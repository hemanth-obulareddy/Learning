import java.util.Scanner;

public class Demo {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks=scan.nextInt();
	scan.close();
	System.out.println("Welcome to Kodnest");
	 condition(marks);
}
 public static void condition(int marks)
 {
	 if(marks>=80)
	 {
		 System.out.println("Welcome to Tech Club");
	 }
 }
}
