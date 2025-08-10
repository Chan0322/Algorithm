import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		factorial();
	}

	public static void factorial() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		// 팩토리얼 계산
		long res = 1;
		for(int i=1; i<=n; i++) {
			res *= i;
		}
		
		bw.write(res+"");
		bw.close();
		br.close();
	}
}
