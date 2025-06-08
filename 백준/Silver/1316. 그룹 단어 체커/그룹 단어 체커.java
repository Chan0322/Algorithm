import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		group();
	}

	public static void group() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력받을 단어 갯수
		int n = Integer.parseInt(br.readLine());
		// 그룹단어 카운트
		int gCnt = 0;
		
		// n개의 단어 입력 받아 그룹단어인지 확인
		for(int i=0; i<n; i++) {
			// 각 알파벳이 사용되었는지 확인하기 위함.
			boolean[] chk = new boolean[26];
			//그룹 단어인지 확인하기 위함
			boolean groupWord = true;
			// 단어 입력
			String str = br.readLine();
			
			// 문자열의 각 문자를 읽어서 분석
			for(int j=0; j<str.length(); j++) {
				// 첫 문자는 배열에 체크.
				if(j==0) {
					chk[str.charAt(j)-'a'] = true;
				}else {
					// 첫 문자가 아니면 앞 문자와 비교.
					if(str.charAt(j) != str.charAt(j-1)) {
						if(chk[str.charAt(j)-'a'] == false) {
							// 앞 문자와 다르고, 처음 발견한 문자이면 => 그룹 단어.
							chk[str.charAt(j)-'a'] = true;
//							gCnt++;
						}else {
							// 위 조건을 만족하지 않으면 그룹단어 X
							groupWord = false;
						}
					}
				}
			}
			// 그룹단어이면 카운트 증가
			if(groupWord) {
				gCnt++;
			}
		}
		bw.write(gCnt+"");
		bw.close();
	}
}
