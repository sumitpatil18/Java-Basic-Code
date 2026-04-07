class A {
	void funA(){
		int a = 100;
		System.out.println(" Value Of a:"+a);
	}
}

class B extends A {
	void funB(){
		int a = 200;
		System.out.println(" Value Of b:"+a);
	}
}

class MultiLevelInheritance extends B{
    public static void main(String[] var){
	MultiLevelInheritance mli = new MultiLevelInheritance();
	mli.funA();
	mli.funB();
    }
}
   
