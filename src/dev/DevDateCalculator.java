package dev;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DevDateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();

		// Format the current time for display

        String formattedTime = date.format(timeFormatter);

        // Get the current hour
        int hour = date.getHour();

        // Determine the appropriate greeting
        String greeting;
        if (hour >= 5 && hour < 12) {
            greeting = "Good Morning";
        } else if (hour >= 12 && hour < 17) {
            greeting = "Good Afternoon";
        } else if (hour >= 17 && hour < 21) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }

        // Print the greeting along with the current time
        System.out.println(greeting + "! The current time is " + formattedTime);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter operation \n 1. Add Days 2. Add Month 3. Add Years 4. Subtract Years");
        int operation = sc.nextInt();

        switch(operation) {
        	case 1: System.out.println("Adding days to date "+ date); break;
        	case 2: System.out.println("Adding month to date "+ date);
        			System.out.println(date.plusMonths(sc.nextInt()));
        			break;
        	case 3: System.out.println("Adding years to date "+ date); break;
        	case 4: System.out.println("Subtracting years to date "+ date); break;
        	default: System.out.println("Unspecified operation");
        }

	}

}
