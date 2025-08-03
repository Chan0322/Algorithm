import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Bridge();
	}

	public static void Bridge() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 개수
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			// 큰 값 처리를 위해 BigInteger 사용
			BigInteger res = Factorial(m).divide(Factorial(n).multiply(Factorial(m - n)));
			
			bw.write(res+"\n");
		}
		
		bw.close();
		br.close();
	}
	
	public static BigInteger Factorial(int n) {
		BigInteger res = BigInteger.ONE;
		for(int i=n; i>0; i--) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}
}
