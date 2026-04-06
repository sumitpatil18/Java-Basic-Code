//import the Scanner class 
import java.util.Scanner; 
class UserInput{
	public static void main(String[] args) {
		String userName;
		Scanner sc = new Scanner(System.in);

		// Enter username to user
    		System.out.print("Enter username:"); 
    		userName = sc.next();   
    		System.out.println("Username is: " + userName);        
  	}
}
