package exampleStrings;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//scenario 1
		String s1="Welcome";
		String s2="Welcome";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
	//if we are creating string variables like this we can use == or .equals there is no difference
		
		//Scenarion 2
		String str=new String("Welcome");
		String str1=new String("Welcome");
		System.out.println(str1==str);//false  //compares the object
		System.out.println(str.equals(str1));//true //compares the values of the object
		
		//== is used to compare object whereas equals() is used to compare the values of object
		//when you create string as object only we can see this difference
		
	}

}
