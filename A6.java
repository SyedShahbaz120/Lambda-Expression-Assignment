package lambdaExpression;


import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"shah","steve","jug","erik"};
		List<String> arrayList=Arrays.asList(arr);
		arrayList.replaceAll(e->e.toUpperCase());
		System.out.println(arrayList);
		
	}

}