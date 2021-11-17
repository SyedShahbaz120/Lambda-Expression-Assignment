package lambdaExpression;

import java.util.*;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList<String> a = new ArrayList<>();
		a.add("Surya");
		a.add("teju");
		a.add("rahim");
		a.add("atif");		
		a.add("shoaib");
		a.add("sameer");
		System.out.println("Before removing : "+a);
		a.removeIf(name->(name.length()%2!=0));
		System.out.println("After removing : "+a);
		
		
	}

}