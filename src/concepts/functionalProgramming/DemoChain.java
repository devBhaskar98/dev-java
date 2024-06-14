package concepts.functionalProgramming;

import java.util.function.BiFunction;

class DemoChain {
    private int result;

    // BiFunctions for basic arithmetic operations
    BiFunction<Integer, Integer, Integer> mySum = (x, y) -> x + y;
    BiFunction<Integer, Integer, Integer> myMultiply = (x, y) -> x * y;
    BiFunction<Integer, Integer, Integer> mySubtract = (x, y) -> x - y;
    BiFunction<Integer, Integer, Integer> myDivide = (x, y) -> x / y;

    // Method to apply sum operation
    public DemoChain sum(int x, int y) {
        this.result = mySum.apply(x, y);
        return this;
    }

    // Method to apply sum operation on the current result
    public DemoChain sum(int y) {
        this.result = mySum.apply(this.result, y);
        return this;
    }

    // Method to apply multiply operation
    public DemoChain multiply(int x, int y) {
        this.result = myMultiply.apply(x, y);
        return this;
    }

    // Method to apply multiply operation on the current result
    public DemoChain multiply(int y) {
        this.result = myMultiply.apply(this.result, y);
        return this;
    }

    // Method to apply subtract operation
    public DemoChain subtract(int x, int y) {
        this.result = mySubtract.apply(x, y);
        return this;
    }

    // Method to apply subtract operation on the current result
    public DemoChain subtract(int y) {
        this.result = mySubtract.apply(this.result, y);
        return this;
    }

    // Method to apply divide operation
    public DemoChain divide(int x, int y) {
        if (y != 0) {
            this.result = myDivide.apply(x, y);
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return this;
    }

    // Method to apply divide operation on the current result
    public DemoChain divide(int y) {
        if (y != 0) {
            this.result = myDivide.apply(this.result, y);
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return this;
    }

    // Method to get the final result
    public int getResult() {
        return this.result;
    }

    // Main method to demonstrate the chaining functionality
    public static void main(String[] args) {
        DemoChain math = new DemoChain();
        int result = math.sum(2, 5).multiply(2).subtract(3).getResult();
        System.out.println("Result: " + result);
    }
}