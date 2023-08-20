import java.util.Scanner;

public class DoubleTrouble {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a value");
	int num=scan.nextInt();
	scan.close();
	System.out.println(doubleTheNumber( num));
}
public static int doubleTheNumber(int num) {
	return num*2;
}
}
