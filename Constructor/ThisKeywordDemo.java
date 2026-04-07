public class ThisKeywordDemo{
	//First call default constructor then is see (this(10)) then call int constructor
	public ThisKeywordDemo(){
		this(10);
		System.out.println("Default constructor...");
    	}
	//Go to int constructor it is also see (this(20.5f);) then call float connstructor
    	public ThisKeywordDemo(int a){
         	this(20.5f);
		System.out.println("Integer parameterized  constructor...");
        	System.out.println("Integer constructor value is :"+a);
    	}
	//Execute the this constructor full, then return go back to int constructor execute its finish execution,
	//then go back to default constructor and finish work ...
    	public ThisKeywordDemo(float b){
		System.out.println("Float parameterized  constructor...");
        	System.out.println("Float costructor value is :"+b);
    	}
   	public static void main(String args[]){
        	new ThisKeywordDemo();
	}
}
