import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		movie();
	}

	public static void movie() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int endOfWorld = 666;
		int cnt = 1;
		
		// cnt가 n번 되면 종료
		while(n != cnt) {
			endOfWorld++;
			// 수를 증가시키고
			if(Integer.toString(endOfWorld).contains("666")) {
				// 증가된 수에 666이 포함되면 cnt 증가
				cnt++;
			}
		}
		bw.write(endOfWorld+"");
		bw.close();
		br.close();
	}
}
