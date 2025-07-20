import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		findPrime();
	}

	public static void findPrime() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// m, n 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 소수만 찾아 출력
		for(int i=m; i<=n; i++) {
			if(isPrime(i)) {
				bw.write(i+"\n");
			}
		}
		bw.close();
		br.close();
	}
	public static boolean isPrime(int num) {
		if(num < 2) {return false;}	// 2보다 작으면 소수 아님
		
		// 약수는 sqrt보다 작아야 함.
		int sqrt = (int)Math.sqrt(num);
		for(int i=2; i<=sqrt; i++) {
			// 나눠지는 수가 있으면 소수 아님.
			if(num%i == 0) {return false;}
		}
		
		return true;
	}
}
