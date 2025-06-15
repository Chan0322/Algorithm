import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		decimal();
	}

	public static void decimal() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 소수 갯수
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			// 소수인지 확인
			boolean decimal = true;
			if(num == 1) {
				decimal = false;	// 1소수 아님.
			}else {
				for(int j=2; j<num; j++) {
					if(num%j == 0) {
						// 소수가 아닌 경우.
						decimal = false;
					}
				}
			}
			
			// 소수 갯수 세기
			if(decimal) {
				cnt++;
			}
		}
		bw.write(cnt+"");
		bw.close();
	}
}
