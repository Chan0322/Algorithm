import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		mathIsPEClass();
	}

	public static void mathIsPEClass() throws NumberFormatException, IOException {
		// 정사각형의 개수는 1, 3, 5....... 순으로 늘어남.
		// 도형의 둘레는 4, 8, 12..... 순으로 늘어남 => 4씩 증가
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());	// 정사각형의 갯수
		
//		int res = 0;	// 도형의 둘레
		long res = 0;	// int로 계산 할 경우 int의 유효 범위를 초과할 경우 불가.
		
		for(int i=1; i<=n; i++) {
			res += 4;
		}
		
		bw.write(res+"");
		bw.close();
		br.close();
	}
}
