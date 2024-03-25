package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 파일에서 스트립 얻기.
public class StreamExample {

	public static void main(String[] args) {

		try {
			// 파일에서 스트림을 얻으려면 Path 객체가 필요하다.
			Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
			Stream<String> stream = Files.lines(path,Charset.defaultCharset());
			stream.forEach(t -> {
				System.out.println(t);
			});
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
