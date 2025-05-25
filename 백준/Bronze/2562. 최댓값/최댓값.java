import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		maxNum();
	}
	
	public static void maxNum() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[9];
		int max = arr[0]; // 최댓값
		int count = 0;		// 해당 최댓 값의 위치
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());  // 배열에 정수 저장.
			
			if(max<arr[i]) {
				max = arr[i];
				count = i+1;
			}
		}
		bw.write(max + "\n" + count);
		bw.close();
	}

}
