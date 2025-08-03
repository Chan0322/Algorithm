import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Green();
	}

	public static void Green() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// n=1 -> 2 / n=2 -> 4 / n=3 -> 8..... => 2의 n제곱
		int n = Integer.parseInt(br.readLine());
		bw.write((int)Math.pow(2, n)+"");
		bw.close();
		br.close();
	}
}
