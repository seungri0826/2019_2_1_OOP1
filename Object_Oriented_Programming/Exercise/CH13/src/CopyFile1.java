import java.io.*;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(BufferedReader in = new BufferedReader(new FileReader("test.txt"));
				PrintWriter out = new PrintWriter(new FileWriter("output.txt"))){
			String line;
			while ((line = in.readLine()) != null) {
				out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
				

	}

}
