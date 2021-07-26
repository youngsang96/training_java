package ch16_stream;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class FileToStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("������ ������ ��Ʈ���� �̿��Ͽ� ȭ�鿡 ���");
		BufferedReader br = new BufferedReader(
				new FileReader(new File("src/ch16_stream/FileToStreamEx01.java")));
		
		br.lines()
		.forEach(s->System.out.println(s));
		
		System.out.println("src/ch16_stream ���� ���====");
		System.out.println();
		Path path = Paths.get("src/ch16_stream");
		Stream<Path> st = Files.list(path);
		st.forEach(p -> System.out.println(p.getFileName()));
		System.out.println("C:");
		System.out.println();
		System.out.println("C:/");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
	}

}
