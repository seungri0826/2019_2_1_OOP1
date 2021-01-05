import java.io.*;

public class exercise6 {
	private static char key =(char) 0xFFFF;
	
	public static void encrypt(String inFile, String outFile) throws FileNotFoundException, IOException {
		try(Reader in = new FileReader(inFile);
				Writer out = new FileWriter(outFile)) {
					
					boolean done = false;
					while (!done) {
						int next = in.read();
						if(next == -1) done = true;
						else {
							char b = (char) next;
							char c = (char) (b ^ key);
							out.write(c);
							System.out.print((char)(c ^ key));
						}
					}
				}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputFileName = "input1.txt";
		String outputFileName = "output1.txt";
		encrypt(inputFileName, outputFileName);
		//encrypt("input1.txt", "output1.txt");
	}

}
