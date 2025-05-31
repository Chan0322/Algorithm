import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		sangsu();
	}
	
	public static void sangsu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n1 = st.nextToken();
		String n2 = st.nextToken();
		
		String num1 = "";
		String num2 = "";
		
		
		// 세자리 수의 각 자릿수를 가져와 역순으로
		for(int j=2; j>=0; j--) {
			num1 += n1.charAt(j);
			num2 += n2.charAt(j);
		}
		
		// 값 비교를 위하여 입력된 문자열을 정수값으로 변환.
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
        // 삼항연산자 이용. 조건에 맞춰 출력
		bw.write( (number1>number2)?num1:num2 );
		bw.close();
	}
}
