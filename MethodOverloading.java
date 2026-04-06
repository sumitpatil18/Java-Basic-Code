import java.util.Scanner;
//Method Overloading is a static polymorphism and its a Compile time check
class MethodOverloading {
	int fun(int x,int y){
		return (x*y);
        }
	double fun(double x, double y){
            	return (x+y);
        }
        public static void  main(String args[]){
		int a,b;
		double x,y;
		MethodOverloading mo = new MethodOverloading();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();

		System.out.println("Enter the first number:");
		x=sc.nextDouble();
		System.out.println("Enter the second number:");
		y=sc.nextDouble();
            	System.out.println(mo.fun(a,b));
            	System.out.println(mo.fun(x,y));
        }
		
}
