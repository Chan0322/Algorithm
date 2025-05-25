import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		ballIn();
	}
	
	public static void ballIn() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());		// 바구나 수
		int M = Integer.parseInt(st1.nextToken());		// 입력 줄 수
		int arr[] = new int[N];		// 바구니 배열
		
		for(int i=0;  i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st2.nextToken());
			int J = Integer.parseInt(st2.nextToken());
			int K = Integer.parseInt(st2.nextToken());

			//공 넣기
			for(int j=I-1; j<J; j++) {
				arr[j] = K;
			}
		}
		// 출력
		for(int k=0; k<arr.length; k++) {
			bw.write(arr[k] + " ");
		}
		bw.close();
	}
}
