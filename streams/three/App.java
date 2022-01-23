package streams.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {

//		Stream<String> lines = Files.lines(Paths.get("G:\\Learning\\java_playground\\src\\streams\\three\\wordFile.txt"));
//		lines
//			.filter(l -> l.length() > 6)
//			.sorted()
//			.forEach(x-> System.out.print(x + ", "));
//		lines.close();
		
		/*     -----     */
		
		List<String> words = Files.lines(Paths.get("G:\\Learning\\java_playground\\src\\streams\\three\\wordFile.txt"))
				.filter(x -> x.contains("th"))
				.collect(Collectors.toList());

//		words.forEach(System.out::println);
		
		/*     -----     */
		
//		Stream<String> rows = Files.lines(Paths.get("G:\\Learning\\java_playground\\src\\streams\\three\\stockDataCsv.txt"));
//		int rowCount = (int) rows
//			.map(x -> x.split(","))
//			.filter(x -> x.length > 3)
//			.count();
//		System.out.println(rowCount + " good rows.");
//		rows.close();
		
		/*     -----     */
		
		Stream<String> rows = Files.lines(Paths.get("G:\\Learning\\java_playground\\src\\streams\\three\\stockDataCsv.txt"));	
		rows
			.map(x -> x.split(","))
			.filter(x -> x.length > 3)
			.filter(x -> Integer.parseInt(x[1].trim()) > 15)
			.forEach(x -> System.out.println(x[0].trim() + " " + x[1].trim() + " " + x[2].trim()));
		
		rows.close();
	}

}
