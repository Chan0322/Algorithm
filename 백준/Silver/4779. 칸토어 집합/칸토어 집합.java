import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		cantor();
	}

	public static void cantor() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		
		while((line=br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			int length = (int)Math.pow(3, n);
			char[] arr = new char[length];
			
			// - 로 초기화
			for(int i=0; i<length; i++) {
				arr[i] = '-';
			}
			
			// 가운데 공백으로
			remove(arr, 0, length);
			
			bw.write(new String(arr)+"\n");
		}
		bw.close();
		br.close();
	}
	public static void remove(char[] arr, int start, int size) {
		if(size<3) {return;}
		
		int third = size/3;
		for(int i=start+third; i<start+2*third; i++) {
			arr[i]=' ';
		}
		
		// 분리된 좌측과 우측
		remove(arr, start, third);
		remove(arr, start+2*third, third);
	}
}
