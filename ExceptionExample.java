import java.util.Scanner;
public class ExceptionExample{
	Scanner sc=new Scanner(System.in);
	void fun(){
		try{
			int a,b;
			System.out.println("Enter the first number:");
			a=sc.nextInt();
			System.out.println("Enter the second number:");
			b=sc.nextInt();
			
            		a/=b;
            		System.out.println("Division Of :"+a);
		}
        	catch(ArithmeticException e){
		
            		System.out.println("Exception occure "+e);
        	}
        	finally{
			System.out.println("Code Completed");
        	}
	}
	
    	public static void main(String[] args){
		ExceptionExample e1=new ExceptionExample();
		e1.fun();
        
    	}   
}
