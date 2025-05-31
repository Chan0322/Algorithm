import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		numSum();
	}
	
	public static void numSum() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		int sum = 0;
		
		// 각 자리의 수 합
		for(int i=0; i<n; i++) {
			sum += Character.getNumericValue(str.charAt(i));   // char 를 정수형으로 변환
		}
		bw.write(sum+"");
		bw.close();
	}
}
