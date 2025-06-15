import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		primeFactorization();
	}

	public static void primeFactorization() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		// 소수인 인수들로 나눠야 함.
		int i = 2;
		while(true) {
			if(n==1) {break;} // 1은 불가!
			
			if(n%i == 0) {
				// 나눠떨어지면 n에 반영하고 몫 출력
				n /= i;
				bw.write(i+"\n");
			}else {
				// 나눠떨어지지 않으면, 다음 인수로 변경하고 반복
				i++;
			}
		}
		bw.close();
	}
}
