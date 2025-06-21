import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		representative();
	}

	public static void representative() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[5];	// 값들 저장할 배열
		
		// 배열에 값 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 배열 오름차순 정렬
		Arrays.sort(arr);
		
		int min = arr[2]; // 중앙값
		
		// 평균값 구하기
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/5;
		
		bw.write(avg+"\n");
		bw.write(min+"");
		bw.close();
		br.close();
	}
}
