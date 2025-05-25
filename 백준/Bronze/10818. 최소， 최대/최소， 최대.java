import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		compare();
	}

	
	public static void compare() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
	
		StringTokenizer st = new StringTokenizer(br.readLine());    // 정수를 입력받음 	
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());			// 배열에 각 정수들 저장.
		}
		
		// 정수들의 최대 최소 비교
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		bw.write(min + " " + max);
		bw.close();
	}
}
