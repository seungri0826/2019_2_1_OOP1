import java.io.*;
import java.util.Scanner;

public class ByteStreamLab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원본 파일 이름을 입력하시오: ");
		String inputFileName = scan.next();
		
		System.out.print("복사 파일 이름을 입력하시오: ");
		String outputFileName = scan.next();

		try (InputStream inputStream = new FileInputStream(inputFileName);
				OutputStream outputStream = new FileOutputStream(outputFileName)) {
			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		System.out.println(inputFileName + "을 " + outputFileName + "로 복사하였습니다. ");
	}

}
