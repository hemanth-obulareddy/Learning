import java.util.Scanner;

public class Main
{
	public static void identifyCharacter(char ch)
	{
		if(ch>='a' && ch<='z')
		{
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
				System.out.println(" Lower-case vowe");
			}
			else
			{
				System.out.println("Lower-case consonant");
			}	
		}
		else if(ch>='A' && ch<='Z')
		{
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				System.out.println("Upper-case vowel");
			}
			else
			{
				System.out.println("Upper-case consonant");
			}
		}
		else if(ch>=0 && ch<=9)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("special character");
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char ch=scan.next().charAt(0);
		scan.close();
		identifyCharacter(ch);
	}

}