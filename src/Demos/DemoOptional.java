package Demos;

import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {

		String str[] = { "welcome" };

		Optional<String> chk = Optional.ofNullable(str[0]);

		chk.ifPresent(System.out::println);

//		System.out.println(str);
//		if (chk.isPresent()) {
//			System.out.println(chk.get());
//		} else {
//			System.out.println("NULL");
//		}

	}

}
