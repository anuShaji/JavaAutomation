package exampleConstructors;

public class StudentMain {
	int x,y;
StudentMain()//default constructor
{
x=100;
y=200;
}
StudentMain(int a,int b){//parameterized constructor
	x=a;
	y=b;
}
void sum() {
	System.out.println(x+y);
}
	public static void main(String[] args) {
		StudentMain stu=new StudentMain();
		stu.sum();
		StudentMain stu2=new StudentMain(30,40);
		stu2.sum();
}		
}


