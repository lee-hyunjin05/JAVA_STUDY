package exam02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectory {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Java programming/Sources");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()) );

	}

}
