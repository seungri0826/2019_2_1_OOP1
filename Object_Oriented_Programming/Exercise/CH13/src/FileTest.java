import java.io.*;
import java.util.*;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name = "c:\\Temp";
		File dir = new File(name);
		String[] fileNames = dir.list();
		for (String s : fileNames) {
			File f = new File(name + "\\" + s);
			System.out.println("===================================");
			System.out.println("이름: " + f.getName());
			System.out.println("경로: " + f.getPath());
			System.out.println("부모: " + f.getParent());
			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("정규경로: " + f.getCanonicalPath());
			System.out.println("디렉토리 여부: " + f.isDirectory());
			System.out.println("파일 여부: " + f.isFile());
			System.out.println("===================================");
		}

	}

}
