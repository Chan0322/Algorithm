import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		chgTen();
	}

	public static void chgTen() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
		int n = 0;	// 변환할 수 저장
		int res = 0; // 결과 저장용
		int j = 0; //제곱할 지수
		
		// 진법 변환은 오른쪽 부터!
		for(int i=N.length()-1; i>=0; i--) {
			char ch = N.charAt(i);
//			if(ch>=0 && ch<=9) {       => 숫자가 아닌 문자로 해야 아스키코드!
			if(ch>='0' && ch<='9') {
				n = Character.getNumericValue(ch);
			}else {
				// 'A' = 65.  A일 때 10이 되어야 함. 
				n = ch - 55;
			}
			res += n * Math.pow(B, j++);
			// 자바에서 제곱을 하기 위해서는 Math.pow(밑수, 지수)를 사용.
			// '^'은 제곱이 아닌 XOR 연산으로 사용됨!!
		}
		bw.write(res+"");
		bw.close();
	}
}
