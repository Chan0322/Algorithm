import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		firstEnd();
	}

	public static void firstEnd() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		String[] sarr = new String[t];	// 테스트 케이스 갯수만큼 각 문자열의 첫글자, 마지막 글자를 저장하기 위한 배열
		
		for(int i=0; i<t; i++) {
			String str = br.readLine();
			sarr[i] = "";
			
			// 문자열 찾기
			for(int j=0; j<str.length(); j++) {
				// 첫 글자
				if(j==0) {
					sarr[i] += str.charAt(j);
				}
				// 마지막 글자
				if(j==(str.length()-1)) {
					sarr[i] += str.charAt(j);
				}
			}
			
			// 각 문자열의 첫, 마지막 글자 출력
			bw.write(sarr[i]+"\n");
		}
		bw.close();
	}
}
