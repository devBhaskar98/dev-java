package dev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DevGCD {

	BufferedReader stndin = new BufferedReader(new InputStreamReader(System.in));
	String line;

	public static void main(String[] args) throws IOException{

		DevGCD devGCD = new DevGCD();
		int m = 0,n = 0;

		System.out.println("Input a integer");
		if((devGCD.line = devGCD.stndin.readLine()) != null ) {
			m = Integer.valueOf(devGCD.line).intValue();
		}

		System.out.println("Input a integer");
		if((devGCD.line = devGCD.stndin.readLine()) != null ) {
			n = Integer.valueOf(devGCD.line).intValue();
		}

		int bigNumber = 0;
		int result = 0;

		/*
		 *
		 * However, if you specifically want to optimize the current loop-based approach,
		 *  you can reduce the number of iterations by iterating only up to the smaller of the two numbers (min(m, n))
			and iterating in reverse to find the first common divisor, which will be the GCD.
		 * */

		if(m>n) {
			bigNumber = m;

		} else {
			bigNumber = n;
		}

//		for(int i=1;i<bigNumber;i++) {
//			if(m%i ==0 && n%i==0) {
//				result = i;
//			}
//		}

		// Ecludiean Algorithm
		int gcd = findGCD(m, n);

		System.out.println("G.C.D of number is "+ gcd);

	}

	public static int findGCD(int a, int b) {
		int iteration = 0;
        while (b != 0) {
        	System.out.println("iteration" + iteration);
        	System.out.println("b" + b);
            int temp = b;
            System.out.println("temp" + temp);
            b = a % b;
            System.out.println("divide b" + b);
            a = temp;
            System.out.println("divide a" + a);
            iteration++;
        }
        return a;
    }
}
