package exampleStrings;

public class CountChararchterOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="java programming lamguage oops jaaava";
int totalcount=str.length();
int totaclCountafter=str.replaceAll("j", "").length();
int count=totalcount-totaclCountafter;
System.out.println(count);
	}

}
