package nested;

import java.util.Scanner;

public class ControlConstruct {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
				greet(marks);			
	}
	public static void greet( int marks) {
		if(marks>60) {
			System.out.println("welcome to kodnest");
			if(marks>=80) {
			System.out.println("welcome to Tech Club");
		  }
		}	
	}
}
