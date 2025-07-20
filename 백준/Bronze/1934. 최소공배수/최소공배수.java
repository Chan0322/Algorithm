import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		leastCommonMultiple();
	}

	public static void leastCommonMultiple() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 갯수
		int t = Integer.parseInt(br.readLine());
		
		// t 만큼 입력 받으며 결과값 출력
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			// 최소 공배수는 두 수의 곱을 최대 공약수로 나눈 값이다...
			// 유클리드 호제법으로 최대 공약수를 구한 후 계산..
			int n1 = a;
			int n2 = b;
			while(n2 != 0) {
				int tmp = n2;
				n2 = n1 % n2;
				n1 = tmp;
			}
			// 최소 공배수
			int res = (a*b) / n1;
			
			bw.write(res+"\n");
			
			/*
			-------------시간초과...
			int max = Math.max(a, b);	// 최소공배수는 최댓값보다 커야 함.
			
			// 최소공배수 찾고 출력
			while(true) {
				if(max%a==0 && max%b==0) {
					bw.write(max+"\n");
					break;
				}else {
					max++;
				}
			}
			*/
		}
		bw.close();
		br.close();
	}
}
