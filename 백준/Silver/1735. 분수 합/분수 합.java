import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		fractionSum();
	}

	public static void fractionSum() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//분수 1 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		
		//분수 2 입력
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		// 두 분수의 합
		int a3 = a1*b2 + a2*b1; // 분자
		int b3 = b1*b2;	// 분모
		
		// 최대 공약수로 나누면 기약분수
		// => 최대 공약수 구하기
		int n1 = a3;
		int n2 = b3;
		while(n2 != 0) {
			int tmp = n2;
			n2 = n1 % n2;
			n1 = tmp;		// => 최대 공약수
		}
		
		// 기약분수 구하기
		a3 /= n1;
		b3 /= n1;
		
		//출력
		bw.write(a3 + " " + b3);
		bw.close();
		br.close();
	}
}
