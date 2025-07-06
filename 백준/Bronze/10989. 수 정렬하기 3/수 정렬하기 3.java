import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int nArr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			nArr[i] = Integer.parseInt(br.readLine());
		}
		
		// 정렬
//		for(int i=0; i<n-1; i++) {
//			for(int j=i+1; j<n; j++) {
//				int tmp = 0;
//				if(nArr[i]>nArr[j]) {
//					tmp = nArr[i];
//					nArr[i] = nArr[j];
//					nArr[j] = tmp;
//				}
//			}
//		}
		
		Arrays.sort(nArr);
		
		// 출력
		for(int i=0; i<nArr.length-1; i++) {
			bw.write(nArr[i]+"\n");
		}
		bw.write(nArr[n-1]+"");
		
		bw.close();
		br.close();
	}
}
