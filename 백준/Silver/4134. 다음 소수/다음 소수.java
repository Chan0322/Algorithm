import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		nextPrime();
	}

	public static void nextPrime() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 갯수
		int t = Integer.parseInt(br.readLine());
		
		// n을 1씩 증가시키며 확인
		for(int i=0; i<t; i++) {
			long n = Long.parseLong(br.readLine());
			
			// 소수 찾기
			while(true) {
				if(isPrime(n)) {
					bw.write(n+"\n");
					break;
				}else {
					n++;
				}
			}
		}
		bw.close();
		br.close();
	}
	public static boolean isPrime(long n) {
		if(n < 2) {return false;}	// 소수는 1보다 커야 함..
		if(n == 2) {return true;}	// 2이면 소수 (1, 2)
		if(n % 2 == 0) {return false;}	// 짝수는 소수 아님
		
		long sqrt = (long)Math.sqrt(n);	 // 약수는 sqrt 보다 작아야 함.
		for(long i=2; i<=sqrt; i++) {
			// 나눠지는 수가 있으면 소수 아님
			if( n%i == 0 ) {
				return false;
			}
		}
		return true;
	}
}
