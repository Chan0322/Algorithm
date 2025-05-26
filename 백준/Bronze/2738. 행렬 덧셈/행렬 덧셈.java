import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		sumT();
	}

	public static void sumT() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N][M];
		int arr2[][] = new int[N][M];
		int sum[][] = new int[N][M];
		
		//행렬 A
		for(int i=0; i<arr.length; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		//행렬 B
		for(int i=0; i<arr2.length; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = Integer.parseInt(st3.nextToken());
			}
		}
		
		//행렬 합
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sum[i][j] = arr[i][j] + arr2[i][j];
				bw.write(sum[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.close();
	}
}
