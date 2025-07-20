import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		leastCommonMultiple2();
	}

	public static void leastCommonMultiple2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// a, b 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		// 최대공약수
		long n1 = a;
		long n2 = b;
		while(n2 != 0) {
			long tmp = n2;
			n2 = n1 % n2;
			n1 = tmp;
		}
		
		// 최소 공배수
		long res = (a*b) / n1;
		
		bw.write(res+"");
		bw.close();
		br.close();
	}
}
