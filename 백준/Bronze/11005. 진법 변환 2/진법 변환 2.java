import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		chgTenTo();
	}

	public static void chgTenTo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int a = 0; // 몫을 저장하기 위함.
		
		String str = ""; // 나머지 결과를 저장하기 위함.
		// 10진법 수 n을 b 진법으로 변환하기 위해서는 몫이 0이 될 때까지 b로 나눈 후 나머지 역순!
		while(n>0) {
			a = n % b;
			if(a>=10) {
				// 10을 넘어가면 대문자 아스키코드
				char c = (char)(a+55);
				str += c;
			}else {
				str += a;
			}
			
			n /= b;
		}
		//나머지 역순 출력
		for(int i=str.length()-1; i>=0; i--) {
			bw.write(str.charAt(i)+"");
		}
		bw.close();
	}
}
