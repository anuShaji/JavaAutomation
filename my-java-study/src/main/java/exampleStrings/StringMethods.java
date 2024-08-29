package exampleStrings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str=new String("Hello World");//String class object

String s="Welcome";//String variable
//length(); this finds out the number of charachters in a string the return type of this method is integer
int charVal=s.length();
System.out.println(charVal);
System.out.println("helo Ram".length());//this way also works

//concat();-->join two or more strings,it can join only 2 strings at a time only,Plus operator we can concat as many or the below way
String s1="Welcome";
String s2=" Anupama";
String s4="Java Automation";
String s3=s1.concat(s2);
System.out.println(s2.concat(s3));// for concatenating 3 strings
System.out.println(s1.concat(s2));
System.out.println(s3);
System.out.println(s1.concat(s2+s4));//for concatenating more than 2 strings
System.out.println("Welcome".concat("To java"+" Test"));


//trim();-->remove spaces right and left side of string
String s7="    Hi    ";
System.out.println("Befor trimming "+s7.length());//print string along with spaces 
//now i need to print only the string value not spaces
System.out.println(s7.trim());
System.out.println("After Trimming "+s7.trim().length());


//CharAt()-->Returns a charachter from a string based on index
String str1="Godzilla";
System.out.println(str1.charAt(4));

//contains-->checks  whether a a particular string is a part of main string or not,and returns a boolean value(true/false),It's case sensitive
String str2="Rahul is coming to india";
String str3="is";
System.out.println(str2.contains(str3));//true
System.out.println(str2.contains("coming"));//true
System.out.println(str2.contains("Coming"));//false
System.out.println(str2.contains("ind"));//true


//equals() and eqalsIgnoreCase()-->compare strings
s1="Welcome";
s2="Welcome";
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s1.equals("welcome"));//equals() is case sensitive









// if you want to ignore case sensitivitive use equalsIgnorecase()
System.out.println(s1.equalsIgnoreCase("welcome"));//true


//replace()-->will replace single or multiple sequence of charachters in a string
s="Welcome to seleniun java automation java selenium class and class and classes";
//to replace all the i's with s
System.out.println(s.replace('i', 's'));//output: Welcome to selensun java automatson java selensum class and class and classes
System.out.println(s.replace("automation", "test"));//Welcome to seleniun java test java selenium class and class and classes
String str9="aaabbccbbcc";//replace all a with x and c with y
 String st=str9.replace('a', 'x').replace('c', 'y');
 System.out.println(st);//xxxbbyybbyy

//substring(starting index,ending index+1)-->will extract substring from main string 
//strating index-->0  ending 0+1
String subs="Evaporation";//need to extract oratio
System.out.println(subs.substring(4, 10));


//toUppercase(),toLoweCase()-->converting to capital and small letters
s="Gambling";
System.out.println(s.toUpperCase());

//split()-->splits the string into multiple parts based on the delimeter
s="ram@gmail.com";
String a[]=s.split("@");
System.out.println(Arrays.toString(a));//[ram, gmail.com]
System.out.println(a[0]);//ram
System.out.println(a[1]);//gmail.com


//ex1
String amount="$20,$23,30,40,50";//just need the number only
System.out.println(amount.replace("$","").replace(",", ""));//2023304050

//ex2
s="abc,123@xyz";
String arr[]=s.split(",");
System.out.println(Arrays.toString(arr));//[abc, 123@xyz]
String aar2[]=arr[1].split("@");
System.out.println(Arrays.toString(aar2));
System.out.println(arr[0]);
System.out.println(aar2[0]);
System.out.println(aar2[1]);

//* % ^ & ( )--> can't use as delimeter
	}

}
