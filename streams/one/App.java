package streams.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

//		IntStream
//			.rangeClosed(1, 10)
//			.forEach(x -> System.out.print(x + " "));
//		System.out.println();
		
		/*		---		*/
		
//		IntStream
//			.rangeClosed(1, 10)
//			.skip(5)
//			.forEach(x -> System.out.print(x + " "));
//		System.out.println();
		
		/*		---		*/
		
//		int sum = IntStream
//			.rangeClosed(1, 10)
//			.sum();
//		System.out.println(sum);
		
		/*		---		*/
		
//		Stream.of("Some", "Random", "Words")
////			.sorted()
//			.findFirst()
//			.ifPresentOrElse(
//				System.out::println,
//				() -> System.out.println("Not found!")
//			);
		
		/*		---		*/
		
//		String[] items = {"these", "are", "a", "few", "random", "words"};
//		Stream.of(items)
//			.filter(x -> x.startsWith("a"))
//			.forEach(System.out::println);
		
		/*		---		*/
		
//		Arrays.stream(new int[] {2, 4, 6, 8, 10})
//			.map(x -> x * x)
//			.average()
//			.ifPresent(System.out::println);
		
		/*		---		*/
		
		List<String> listOfItems = Arrays.asList("Computer", "Car", "Toothpaste", "Box", "Pencil");
		listOfItems.stream()
			.map(x -> x.toLowerCase())
			.filter(x -> x.startsWith("c"))
			.sorted()
			.forEach(x -> System.out.print(x + " "));
		
	}

}
