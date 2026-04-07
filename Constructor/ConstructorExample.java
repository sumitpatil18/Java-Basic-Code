class ConstructorExample{  
    	int a,b,c;
	//Default constructor
	public  ConstructorExample(){
        	a=70;b=80;c=90;
	}
	//Parameterised constructor
   	public ConstructorExample(int x, int y,int z){
        	a=x;
        	b=y;
    	    	c=z;
    	}
	//Copy constructor
    	public ConstructorExample(ConstructorExample c){
        	a=c.a;
        	b=c.b;
        	c=c.c;
        	System.out.println("Copy constructor call...");
    	}
    	public void show(){
        	System.out.println("Value of a is:"+a);
        	System.out.println("Value of b is:"+b);
        	System.out.println("Value of c is:"+c);
        }
    public static void main(String args[]){
        ConstructorExample d=new ConstructorExample();
        d.show();
        ConstructorExample d1=new ConstructorExample(10,20,30);
        d1.show();
        ConstructorExample d2=new ConstructorExample(d1);
        d2.show();
    }
}
