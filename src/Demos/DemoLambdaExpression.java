package Demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<>( Arrays.asList(1,2,3,4,5) );

		al.stream().forEach(num -> System.out.println("Number" + num));
		String message = "Number: ";
		al.stream().map(num -> message + num).forEach(System.out::println);
	}

}
