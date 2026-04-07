import java.util.Scanner;

class FindHighestFrequncCharacter {
	Scanner sc=new Scanner(System.in);
	void funFind(){
		System.out.print("Enter the name:");
        	String str=sc.nextLine();
		char store=' ';
		int max=0,count=0;
		//Remove space befor the String and after the String and String convert in to lowerCase
		str=str.trim().toLowerCase();
		int size=str.length();

		for(int i=0;i<size;i++){
	
			// Skip the space in string 
			if(str.charAt(i)==' '){
				continue;
			}

			for(int j=0;j<size;j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;	
				}
			}
			if(count>max){
				max=count;
				store=str.charAt(i);	
			}
			count=0;
		}
		System.out.println("Highest frequency character is:"+store+":"+max);
		
	}
	public static void main(String args[]) {
		FindHighestFrequncCharacter f1 = new FindHighestFrequncCharacter();
		f1.funFind();
	}
}