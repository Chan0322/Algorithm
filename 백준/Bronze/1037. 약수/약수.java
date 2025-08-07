import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		divisor();
	}

	public static void divisor() throws NumberFormatException, IOException {
		// 규칙 : N의 약수를 이용해 N 구하기
		// 		1*N = N / 2*(N-1)=N / 3*(N-2)=N......
		//		=> 진짜 약수는 1과 N을 제외한 약수이므로
		//			주어진 약수들 중 가장 작은 값과 가장 큰 값의 곱.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N의 진짜 약수의 개수
		int num = Integer.parseInt(br.readLine());
		
		// 입력된 약수를 배열로 저장
		int[] a = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 정렬
		Arrays.sort(a);
		
		// N 구하기
		int n = a[0] * a[num-1];
		
		bw.write(n+"");
		bw.close();
		br.close();
	}
}
