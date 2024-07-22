package concepts.functionalProgramming;

@FunctionalInterface
interface StringFunction {
	String runFn(String str);
}

@FunctionalInterface
interface MathFunction {
	int sum(int x, int y);
}

public class DemoLambdaExpression {

	public static void main(String []args) {
		StringFunction exclaim = (s) -> s + "!";

		printFormatted("Hello World", exclaim);
		
//		example 2 : two variables
		System.err.println("Example 2");
		MathFunction math = (x,y) -> x + y;
		int x = 10;
		int y = 20;
		calcMathFunction(x, y, math);
		
		
	}

	public static void printFormatted(String str, StringFunction format) {
		String result = format.runFn(str);
		System.out.println(result);
	}

	public static void calcMathFunction(int x, int y, MathFunction math) {
		System.out.println(math.sum(x, y));

	}

}
