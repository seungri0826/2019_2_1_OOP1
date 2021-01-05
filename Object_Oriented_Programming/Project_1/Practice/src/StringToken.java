import java.util.*;

public class StringToken {

	public static void main(String[] args) {
		String url;
		if(args.length == 0)
			url = "http://www.uos.ac.kr/~bjlee";
		else
			url = args[0];
		StringTokenizer st = new StringTokenizer(url, ":/.~", false);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("token => " + token);
		}

	}

}
