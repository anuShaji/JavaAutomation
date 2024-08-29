package exampleStrings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="  Java programming   se  lenium Anuto   mation";
str=str.replaceAll("\\s", "");
System.out.println(str);
	}

}
