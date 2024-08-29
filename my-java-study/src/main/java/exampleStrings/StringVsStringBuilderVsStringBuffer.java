package exampleStrings;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String immutable
		String s="hello";
		s.concat("World");
		System.out.println(s);//hello value of s not changed
		
		//String buffer is mutable
		StringBuffer sb=new StringBuffer("hello");
		sb.append("World");
		System.out.println(sb);//helloWorld changed
		
		//String builder is mutable
				StringBuilder sbu=new StringBuilder("hello");
				sbu.append("World");
				System.out.println(sb);//helloWorld changed
	}

}
