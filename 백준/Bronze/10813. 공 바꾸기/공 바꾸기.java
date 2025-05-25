import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		chgBall();
	}
	
	public static void chgBall() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st1.nextToken());	// 바구니 수
		int M = Integer.parseInt(st1.nextToken());	// 몇 줄
		int arr[] = new int[N];		// 바구니
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;   	// 배열에 1 2 3 4 5 ...... 저장
		}
		for(int j=0; j<M; j++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st2.nextToken());
			int J = Integer.parseInt(st2.nextToken());
			
			int a = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = a;
		}
		// 출력
		for(int k=0; k<arr.length; k++) {
			bw.write(arr[k] + " ");
		}
		bw.close();
	}

}
