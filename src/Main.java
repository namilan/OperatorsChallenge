
public class Main {
	
	public static void main(String[] args) {
	
	//1) Create a double variable with a value of 20.00
	//2) Create a second variable of type double with the value of 80.00
	//3) Add both numbers together and multiply by 100.
	//4) use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00. 
	// We used the modulus or remainder operator on ints in the course, but we can also use it on a double
	//5) Create boolean variable that assigns the value true if the remainder in $4 is 0, or false if it's not zero.
	//6) Output the boolean variable
	//7) Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true. 
	// Don't be surprised if you see output in this step, where you expect it to not show. 

	double first_number, second_number, answer;
	
	first_number = 20.00;
	second_number = 80.00;
	answer = first_number + second_number;
	System.out.println("Total = " + answer);
	
	answer = answer * 100.00;
	System.out.println("Total = " + answer);
	
	answer = answer % 40.00;
	System.out.println("Total = " + answer);
	
	boolean isZero = false;
	if(!isZero) {
		System.out.println("True.");
	}
	
//	isZero = false;
	boolean notZero = isZero ? true : false;
	if(notZero) {
		System.out.println("Got some remainder.");
	}
	
	}
	
}
