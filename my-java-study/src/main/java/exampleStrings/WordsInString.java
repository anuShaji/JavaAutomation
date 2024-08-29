package exampleStrings;

import java.util.Scanner;

public class WordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=1;
for(int i=0;i<s.length()-1;i++) {
	if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
		count++;
	}
}
System.out.println("number of variables in a string"+count);
	}

}
