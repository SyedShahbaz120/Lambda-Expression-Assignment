package lambdaExpression;


import java.util.ArrayList;
import java.util.List;

public class A5 {
  public static void main(String[] args) {
	  List<String> names = new ArrayList<>();
	  names.add("shah");
	  names.add("rahim");
	  names.add("abdul");
	  names.add("syed");
	  
	  StringBuilder result = new StringBuilder();
	  names.forEach(s->result.append(s.charAt(0)));
	  System.out.println(result);
  }
  
}