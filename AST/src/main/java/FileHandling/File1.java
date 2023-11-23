package FileHandling;

import java.io.File;

public class File1 {
	public static void main(String[] args) {
		File file = new File("Example1");
		System.out.println(file.mkdir());
		System.out.println(file.getAbsolutePath());
	}

}
