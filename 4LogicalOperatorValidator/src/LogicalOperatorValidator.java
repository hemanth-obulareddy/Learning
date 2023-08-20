import java.util.Scanner;

public class LogicalOperatorValidator {
	

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        boolean isValid = sc.nextBoolean(); // Set this based on input validation logic
	        boolean meetsCondition =sc.nextBoolean() ; // Set this based on condition checking logic

	        boolean isInputValid = isValidInput(isValid, meetsCondition);

	        System.out.println("Is input valid (true/false): " + isInputValid);
	        System.out.println("Does input meet a certain condition (true/false): " + meetsCondition);
	        sc.close();
	        if (isInputValid) {
	            System.out.println("Input is valid.");
	        } else {
	            System.out.println("Input is not valid.");
	        }
	    }
	    public static boolean isValidInput(boolean isValid, boolean meetsCondition) {
	        return isValid && meetsCondition;
	    }


}
