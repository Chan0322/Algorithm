import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		DecompositionSum();
	}

	public static void DecompositionSum() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = 0;
		// 1~n까지 모든 경우의 수 접근
		for(int i=1; i<=n; i++) {
			int mSum = 0;
			int tmp = i;
			
			
			// 각 자릿수 합 구하기
			while(tmp!=0) {
				mSum += tmp%10;	//10의 자리씩 나눈 나머지 => 각 자릿수
				tmp /= 10;  // 다음 자릿수로 이동
			}
			
			if(i+mSum == n) {
				m = i;
				break;
			}
		}
		bw.write(m+"");
		bw.close();
		br.close();
	}
}
