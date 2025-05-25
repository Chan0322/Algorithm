import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		countN();
	}

	public static void countN() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());					// 입력받을 정수의 갯수
		int arr[] = new int[n];										// 입력받은 정수 목록 저장할 배열
		StringTokenizer st = new StringTokenizer(br.readLine());	// 입력받은 정수 목록 구분
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());				// 입력받은 값 배열에 저장
		}
		
		int v = Integer.parseInt(br.readLine());					// 배열과 비교할 값 입력
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(v  == arr[i]) {
				count++;							// 비교 후 갯수 카운트
			}
		}
		bw.write(count+"\n");
		bw.close();
	}
}
