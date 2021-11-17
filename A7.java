package lambdaExpression;


import java.util.HashMap;
import java.util.Map.Entry;

public class A7
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> h=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		h.put(1, "cricket");
		h.put(2, "football");
		h.put(3, "baseball");
		h.put(4, "hockey");
		System.out.println("The elements in the hashmap are:");
		System.out.println(h);		
		System.out.println("After converting entire hashmap into a string, the result is:");
		for (Entry<Integer, String> m:h.entrySet()) 
		{
			sb.append(m); //Original string is changed
		}
		System.out.println(sb);
		
	}

}
