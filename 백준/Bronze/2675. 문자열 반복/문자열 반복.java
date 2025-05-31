import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		strRepeat();
	}
	
	public static void strRepeat() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		String[] p = new String[t];
		
		for(int i=0; i<t; i++) {
			p[i]  = "";				// 출력할 문자열 배열 초기화
			st = new StringTokenizer(br.readLine(), " ");	// 공백으로 각 줄의 반복 횟수, 문자열 입력 분리
			int r = Integer.parseInt(st.nextToken());		// 반복 횟수
			String s = st.nextToken();						// 문자열
			
			//문자열의 각 자릿수 반복
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					p[i] += s.charAt(j);	// 문자열의 길이만큼 반복 -> 각 문자마다 반복횟수만큼 반복
				}
			}
			
			// 출력
			bw.write(p[i]+"\n");
		}
		bw.close();
	}
}
