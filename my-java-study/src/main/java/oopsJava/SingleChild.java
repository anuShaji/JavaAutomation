package oopsJava;

import java.util.Scanner;

public class SingleChild extends ParentClass{
	
public void add() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number to add :");
	int num1=sc.nextInt();
	System.out.println("Enter the second number to add :");
	int num2=sc.nextInt();
	int sum=num1+num2;
	System.out.println("Sum is "+sum);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SingleChild obj=new SingleChild();
 obj.display();
 obj.add();
	}

}
