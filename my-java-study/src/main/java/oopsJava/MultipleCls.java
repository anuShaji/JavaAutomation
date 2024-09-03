package oopsJava;

public class MultipleCls implements MultipleInheritance1, MultipleInheritance2 {

	@Override
	public void messgae() {
		// TODO Auto-generated method stub
System.out.println("parent 1 interface");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
System.out.println("Parent 2 interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleCls mc=new MultipleCls();
mc.messgae();
mc.show();

	}

}
