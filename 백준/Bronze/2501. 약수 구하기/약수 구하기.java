import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		factor();
	}

	public static void factor() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 약수 갯수 구하기 (배열 크기 지정 위함)
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			// n을 1~n까지 나눠 나머지가 0이면 약수.
			if(n%i == 0) {
				cnt++;
			}
		}
		// 약수 저장하기 위함
		int facArr[] = new int[cnt];
		
		// 배열에 약수 저장
		int index = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				facArr[index++] = i;
			}
		}
		
		//k번째 약수 출력
		if(facArr.length>=k) {
			bw.write(facArr[k-1]+"");
		}else {
			// 약수 갯수가 k보다 적으면 0
			bw.write(0+"");
		}
		bw.close();
	}
}
