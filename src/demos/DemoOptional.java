package demos;

import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {

		String str[] = { "welcome", null };

		Optional<String> chk = Optional.ofNullable(str[1]);

		chk.ifPresent(System.out::println);

//		System.out.println(str);
//		if (chk.isPresent()) {
//			System.out.println(chk.get());
//		} else {
//			System.out.println("NULL");
//		}

		System.out.println("program executed");

	}

}
