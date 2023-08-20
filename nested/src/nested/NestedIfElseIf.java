package nested;

import java.util.Scanner;

public class NestedIfElseIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter maths and sciene marks");
		int maths=sc.nextInt();
		int science=sc.nextInt();
			kodnest(maths, science);
	}
	public static void kodnest(int maths,int science)
	{
		if(maths>60 && science>=60)
		{
			System.out.println("Welcome to Kodnest");
			if (maths>=80 && science>=60)
			{
				System.out.println("Welcome to Maths Club");
			}
			else if(maths>=60 && science>=80)
			{
				System.out.println("Welcome to Science Club");
			}
			else
			{
				System.out.println("Your not eligible for any Club");
			}
		}
		else
		{
			System.out.println("Your not eligible for Kodnest");
		}
	}
}
