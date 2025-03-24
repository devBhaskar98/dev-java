package demos;

import java.time.LocalDateTime;

public class DemoDate {

	public static void main(String rf[]) {
		// defining date with no nano seconds and fixed second
		LocalDateTime today = LocalDateTime.now().withNano(0).withSecond(20);
		System.out.println(today);

		LocalDateTime nextDay = today.plusDays(1);
		System.out.println(nextDay);

		System.out.println(nextDay.getMonthValue());

		// defining again

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}
}
