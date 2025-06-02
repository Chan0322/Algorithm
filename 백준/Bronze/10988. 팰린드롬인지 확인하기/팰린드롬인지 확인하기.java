import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		paelin();
	}

	public static void paelin() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int res=1;
		
		// 문자열 반 나눠서 비교
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				// 반복문에서 결과 출력 시 결과가 여러 줄 출력 되버림. => 반복문 밖에서 출력
				//System.out.println(1);	// 같을 경우
				res = 0;
			}
		}
//		System.out.println(res);
		bw.write(res+"");
		bw.close();
	}
}
