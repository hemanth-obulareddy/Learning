package loops;

public class Demo11 {

	public static void main(String[] args) {

		int i=1;
		veeru:do
		{
			int j=1;
			hemanth:while(j<=5)
			{
				System.out.println("* ");
				j++;
				break veeru;
			}
			System.out.println();
			i++;
		}while(i<=5);
	}

}