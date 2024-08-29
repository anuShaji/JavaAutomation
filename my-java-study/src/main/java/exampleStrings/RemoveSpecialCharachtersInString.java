package exampleStrings;

public class RemoveSpecialCharachtersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="@A$%HHF**&(JJG";
str=str.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(str);

String s1="anupama*&^$Anutomation((%$#$#Selenium47478Java";
s1=s1.replaceAll("[^a-zA-Z]", "");
System.out.println(s1);
	}

}
