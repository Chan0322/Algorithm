import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		String n = br.readLine();
		
		// 저장할 배열
		int arr[] = new int[n.length()];
		
		for(int i=0; i<n.length(); i++) {
			arr[i] = Character.getNumericValue(n.charAt(i));
		}
		
		// 역순 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int tmp = 0;
				if(arr[i]<arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i]+"");
		}
		
		bw.close();
		br.close();
	}

}
