import java.util.Scanner;
class CreateCalculator{

	Scanner sc=new Scanner(System.in);
    	public void show(){
    
		int a,b,total;

    		System.out.println("Enter The Number");
    		a=sc.nextInt();
    		b=sc.nextInt();
    		
		System.out.println("Select 1: Addition, Select 2:Subtraction, Select 3:Multiplication, Select 3:Division");
		int ch=sc.nextInt();
		switch(ch){
			case 1:
				total=a+b;
				System.out.println("Addition of number:"+total);
				break;

			case 2:
				total=a-b;
				System.out.println("Subtraction of number"+total);
				break;
			
			case 3:
				total=a*b;
				System.out.println("Multiphication of number"+total);
				break;
			
			case 4:
				total=a/b;
				System.out.println("Division of number"+total);
				break;
			default:
				System.out.println("Choose wrong option you...");
			
		}
	}
    	public static void main(String args[]){
        	CreateCalculator c1=new CreateCalculator();
        	c1.show();
    	}
}
