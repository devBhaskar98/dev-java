package concepts.functionalProgramming;

@FunctionalInterface
interface StringFunction{
	String runFn(String str);
}


public class DemoLambdaExpression {
	
	public static void main(String []args) {
		StringFunction exclaim = (s) -> s + "!";
		
		printFormatted("Hello World", exclaim);
	}
	
	 public static void printFormatted(String str, StringFunction format) {
		    String result = format.runFn(str);
		    System.out.println(result);
	 }

}
