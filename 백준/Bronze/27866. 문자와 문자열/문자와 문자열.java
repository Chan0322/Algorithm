import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		findChar();
	}

	public static void findChar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		char ch = ' ';
		
		for(int i=1; i<=str.length(); i++) {
			if(n == i) {
				ch = str.charAt(i-1);
			}
		}
		bw.write(ch+"");
		bw.close();
		
	}
}
