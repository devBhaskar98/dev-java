package Demos;

import java.time.LocalDateTime;

public class DemoDate {

	public static void main(String rf[]) {
		LocalDateTime today = LocalDateTime.now().withNano(0).withSecond(20);
		System.out.println(today);

		LocalDateTime nextDay = today.plusDays(1);
		System.out.println(nextDay);
	}
}
