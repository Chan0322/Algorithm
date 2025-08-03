import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BinomialCoefficient();
	}

	public static void BinomialCoefficient() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 0<=k<=n일 때 이항계수 공식 : n!/(k!(n-k)!)
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int result = Factorial(n) / (Factorial(k)*(Factorial(n-k)));
		bw.write(result+"");
		bw.close();
		br.close();
	}
	
	public static int Factorial(int n) {
		int res = 1;
		for(int i=n; i>0; i--) {
			res *= i;
		}
		return res;
	}
}
