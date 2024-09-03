package oopsJava;

public class EmplCls {
int EmpId;
String Name;
AddressAggregation adg;

	public EmplCls(int empId, String name, AddressAggregation adg) {
	
	EmpId = empId;
	Name = name;
	this.adg = adg;
}
 public void show() {
	 adg.dispayAddress();
	 System.out.println("Name : "+Name);
		System.out.println("Employee ID: " +EmpId);
		System.out.println("City : "+adg.city);
		System.out.println("State : "+adg.state);
		System.out.println("Country : "+adg.address);
		System.out.println("Zip code: "+adg.zipcode);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressAggregation adg1=new AddressAggregation("Kottayam", "Kerala", 88449, "pandarappallil house mannanam po kottaym");
         EmplCls emp=new EmplCls(101, "Bob", adg1);
         emp.show();
	}

}
