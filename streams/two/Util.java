package streams.two;

import java.util.Arrays;
import java.util.List;

public class Util {
	
	public static List<Person> getPeople() {
		return Arrays.asList(
				new Person("Male One", 45, Gender.MALE),
				new Person("Female One", 14, Gender.FEMALE),
				new Person("Male Two", 35, Gender.MALE),
				new Person("Female Two", 24, Gender.FEMALE),
				new Person("Male Three", 25, Gender.MALE),
				new Person("Female Three", 45, Gender.FEMALE),
				new Person("Male Four", 15, Gender.MALE),
				new Person("Female Four", 34, Gender.FEMALE)
			);
	}
	
}
