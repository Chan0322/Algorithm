import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		wordStudy();
	}

	public static void wordStudy() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// a~z 까지 각 문자의 갯수를 카운트 하기 위한 배열
		int cntArr[] = new int[26];
		
		// 가장 많이 사용된 글자를 확인하기 위한 변수
		int max = 0;
		
		// 대소문자를 구분하지 않으므로, 모두 대문자로 변경
		String str = br.readLine().toUpperCase();
		
		// 입력 문자열의 각 자리별 문자를 확인하고, 배열에서 카운트.
		for(int i=0; i<str.length(); i++) {
			int word = str.charAt(i) - 65;	// 대문자 'A' 아스키 코드 값을 뺌 => 해당 글자와 일치하는 배열의 인덱스 번호
			cntArr[word] += 1;
		}
		
		int res = 0;
		
		// 문자 중, 가장 많이 사용된 알파벳 구하기
		for(int i=0; i<cntArr.length; i++) {
			if(max < cntArr[i]) {
				max = cntArr[i];
				// 가장 많이 사용된 알파벳의 대문자 아스키코드 구하기
				res = i + 65;
			}else if(max == cntArr[i]) {
				// 중복으로 존재하면 '?'
				res = 63; // '?' 아스키코드
			}
		}
		
		bw.write((char)res+"");
		bw.close();
	}
}