package exampleStrings;

public class ReverseString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Approach1
	String str2="anupama";
	String rev="";
	for(int i=str2.length()-1;i>=0;i--) {
		rev=rev+str2.charAt(i);
	}
	System.out.println("Reverse is: "+rev);
		//String Buffer class
//	StringBuffer str=new StringBuffer("Welcome");
//	System.out.println("Reverse : "+str.reverse());
//		//String builder class
//	StringBuilder str1=new StringBuilder("WelcomeSha");
//	System.out.println("Reverse : "+str1.reverse());
	
	
	//String is immutable
	String str3="Hello";
	str3.concat(" World");
	System.out.println(str3);
	}
}
