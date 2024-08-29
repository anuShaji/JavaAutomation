package exampleStrings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String("anupama");
String rev="";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
if(str.equals(rev)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("not Palindrome");
}
	}

}
