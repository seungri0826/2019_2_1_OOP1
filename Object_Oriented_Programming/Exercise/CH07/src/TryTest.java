import java.io.*;

public class TryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader fr = new FileReader ("test.txt")){
			char[] a = new char[50];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
