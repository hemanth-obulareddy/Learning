package nested;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two values to check which is bigger where first number should be greater then 10 ");
	int x=sc.nextInt();
	int y=sc.nextInt();
		check(x,y);
}
	public static void check(int a,int b)
	{

      if(a>=10){

          if(a<b){
              System.out.println(b+" is bigger");
          }
          
          else{
              System.out.println(+a+" is bigger");
          }
      }
      else {
    	  System.out.println("a is less then 10");
      }
	}
}
