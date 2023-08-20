package loops;

public class Demo9 {
	public static void main(String[] args) {
		for (;;)
		{
			System.out.println("Hello");
			for (;;)
			{
				System.out.println("Kodnest");
				break;
			}
			System.out.println("Technologies");
			break;
		}
	}
}
