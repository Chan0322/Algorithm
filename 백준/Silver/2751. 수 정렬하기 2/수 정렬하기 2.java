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
		
		// 배열에 저장
		for(int i=0; i<nArr.length; i++) {
			nArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(nArr);
		
		for(int i=0; i<nArr.length; i++) {
			bw.write(nArr[i]+"\n");
		}
		bw.close();
		br.close();
	}
}
