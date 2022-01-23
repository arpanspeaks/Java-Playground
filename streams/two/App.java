package streams.two;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Person> people = Util.getPeople();
		System.out.println("Original list: ");
		people.forEach(System.out::println);
		System.out.println("==============");
		
//		* FILTER ---
		
		List<Person> l1 = people.stream()
			.filter(p -> p.getAge() > 25)
				.collect(Collectors.toList());
		
//		l1.forEach(System.out::println);
		
//		* SORT ---
		
		List<Person> l2 = people.stream()
			.sorted(Comparator.comparing(Person::getAge).reversed()
						.thenComparing(Person::getGender))
				.collect(Collectors.toList());
		
//		l2.forEach(System.out::println);
		
//		* ALL MATCH ---
//		* ANY MATCH ---
//		* NONE MATCH ---
		
		boolean allMatch = people.stream()
				.allMatch(p -> p.getAge() > 15);

		boolean anyMatch = people.stream()
				.anyMatch(p -> p.getAge() > 15);
		
		boolean noneMatch = people.stream()
				.noneMatch(p -> p.getAge() == 10);
		
//		System.out.println(allMatch + " " + anyMatch + " " + noneMatch);
		
//		* MAX ---

		Optional<Person> maxAge = people.stream()
			.max(Comparator.comparing(Person::getAge)
				.thenComparing(Person::getGender));
		
//		maxAge.ifPresentOrElse(
//			System.out::println,
//			() -> System.out.println("Not found!")
//		);
		
//		* MIN ---
		
		Optional<Person> minAge = people.stream()
			.min(Comparator.comparing(Person::getAge));
			
//		minAge.ifPresentOrElse(
//			System.out::println,
//			() -> System.out.println("Not found!")
//		);
			
//		* GROUP ---
		
		Map<Gender, List<Person>> groupedByGender = people.stream()
			.collect(Collectors.groupingBy(Person::getGender));
		
//		groupedByGender.forEach(
//			(gender, person) -> {
//				System.out.println(gender);
//				person.stream()
//					.sorted(Comparator.comparing(Person::getAge))
//						.forEach(System.out::println);
//			}
//		);
		
//		* CHAINING ---
//		Return the first name of the oldest female ---
		
		people.stream()
			.filter(p -> p.getGender() == Gender.FEMALE)
			.max(Comparator.comparing(Person::getAge))
			.map(Person::getName)
			.ifPresentOrElse(
				System.out::println,
				() -> System.out.println("Not found!")
			);
			
	}

}
